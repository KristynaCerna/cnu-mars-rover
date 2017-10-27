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
        char[] commands = commandChain.toCharArray();
            for(char command : commands)
            switch (command) {
                case 'F':;
                    getPosition();
                    return mars.moveForward();
                case 'B':
                    getPosition();
                    return mars.moveBackward();
                case 'L':
                    getPosition();
                    rover.turnLeft();
                    return position;
                case 'R':
                    getPosition();
                    rover.turnRight();
                    return position;
                case 'D':
                    getPosition();
                    return mars.dontMove();
            }
            return getPosition();
        }

    public RoverPosition getPosition() {
        return position;
    }
}