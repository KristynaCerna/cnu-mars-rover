package dk.cngroup.university;

public class SimulatorMovement {
    private static Mars mars;
    private static Rover rover;
    private static Landscape landscape;
    private static RoverPosition position;
    private static RoverPosition initialPosition, finalPosition;
    private static Input input;

    public void obtainInputData(){

        input.recordInput();



        rover = new Rover(Direction.NORTH);

        Field [][] field = new Field[input.getLandscapeSize()][input.getLandscapeSize()];
        input.getMatrix();
        for (int i = 0, i < input.getLandscapeSize(), i++)
            input.getMatrix() += [input.getLandscapeSize() + i];

        position = RoverPositionFactory.getPosition(input.getInitialPosition());
        mars = new Mars(rover, landscape, initialPosition);

        RoverPosition initialPosition = RoverPositionFactory.getPosition(input.getInitialPosition());
        RoverPosition finalPosition = RoverPositionFactory.getPosition(input.getFinalPosition());

        moveRover(input.getCommandChain());
       // iftrue printProtocol
        }

        public RoverPosition moveRover(String commandChain) {
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