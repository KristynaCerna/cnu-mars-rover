package dk.cngroup.university;

public class Movement {
    private Mars mars;
    private Rover rover;
    private RoverPosition position;
    private Input commandChain;

    public Movement(Mars mars, Rover rover, /*Instruction instruction,*/RoverPosition position, Input commandChain) {
        this.mars = mars;
        this.rover = rover;
        this.position = position;
        this.commandChain = commandChain;
    }

        public RoverPosition startSimulator(String commandChain) {
        char[] commands = commandChain.toCharArray();
            for(char command : commands)
            switch (command) {
                case 'F':
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
        return this.position;
    }


}