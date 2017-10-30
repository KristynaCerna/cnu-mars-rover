package dk.cngroup.university;

public class SimulatorMovement {
    private Mars mars;
    private Rover rover;
    private Landscape landscape;
    public RoverPosition position;
    private RoverPosition initialPosition, finalPosition;
    private String inputFromText;
    private String commandChain;


    public SimulatorMovement(Mars mars, Rover rover, Landscape landscape, RoverPosition position,
                             RoverPosition initialPosition, RoverPosition finalPosition, String commandChain) {
        this.mars = mars;
        this.rover = rover;
        this.landscape = landscape;
        this.position = position;
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
        this.commandChain = commandChain;
    }

    public boolean reachedFinalPosition(){
        moveRover(commandChain);
        return finalPosition.equals(mars.getPosition());

    }

    public SimulatorMovement(String inputFromText){
        obtainInputData();
    }

        public void obtainInputData(){

            String[] lines = inputFromText.split("\n");

            initialPosition = ConvertInput.getInitialPositionFromInput(lines[0]);

            Direction direction = ConvertInput.getDirectionFromInput(lines[2]);
            rover = new Rover(direction);

            int landscapeSize = Integer.parseInt(lines[4]);
            String matrix = lines[6].replaceAll("\n", "");
            landscape.createLandscapeFromUserInput(matrix,landscapeSize);

            mars = new Mars(rover,landscape, initialPosition);

            finalPosition = ConvertInput.getFinalPositionFromInput(lines[8]);

            commandChain = lines [10];
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