package dk.cngroup.university;

public class Movement {
    private Mars mars;
    private Rover rover;
   // private Instruction instruction;
    private RoverPosition position;

    public Movement(Mars mars, Rover rover, /*Instruction instruction,*/RoverPosition position) {
        this.mars = mars;
        this.rover = rover;
     //   this.instruction = DONTMOVE;
        this.position = position;
    }

        public RoverPosition startSimulator(String commandChain) {
        for (int i = 0; i < commandChain.length(); i++) {
            switch (commandChain) {
                case "F":
                    return mars.moveForward();
                case "B":
                    return mars.moveBackward();
                case "L":
                    rover.turnLeft();
                    return position;
                case "R":
                    rover.turnRight();
                    return position;
                case "D":
                    return mars.dontMove();
            }
        }
        return position;
    }
}