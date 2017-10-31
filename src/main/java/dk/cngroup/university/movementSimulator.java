package dk.cngroup.university;

public class movementSimulator {
    private Mars mars;
    private Rover rover;
    private Landscape landscape;
    public RoverPosition position;
    private RoverPosition initialPosition, finalPosition;
    private String inputFromText;
    private String commandChain;


    public movementSimulator(Mars mars, Rover rover, Landscape landscape, RoverPosition position, String inputFromText) {
        this.mars = mars;
        this.rover = rover;
        this.landscape = landscape;
        this.position = position;
        this.inputFromText = inputFromText;
    }

    public boolean reachedFinalPosition(){
        moveRover(commandChain);
        return finalPosition.equals(mars.getPosition());

    }

    public movementSimulator(String inputFromText){
        this.inputFromText = inputFromText;
        obtainInputData();
    }

        public void obtainInputData(){

            String[] lines = inputFromText.split("\\n");

            initialPosition = ConvertInput.getInitialPositionFromInput(lines[0]);

            Direction direction = ConvertInput.getDirectionFromInput(lines[2]);
            rover = new Rover(direction);

            int landscapeSize = Integer.parseInt(lines[4]);
            Field[][] field = new Field[landscapeSize][landscapeSize];
            String matrix = "";
            for (int i = 0; i > landscapeSize; i++)
                 matrix += lines[4 + i] + "\n";
            landscape = ConvertInput.getLandscapeFromUserInput(matrix,landscapeSize,field);

            mars = new Mars(rover,landscape, initialPosition);

            finalPosition = ConvertInput.getFinalPositionFromInput(lines[12]);

            commandChain = lines [7];
        }

        public RoverPosition moveRover(String commandChain) {
            char[] commands = commandChain.toCharArray();
            for (char command : commands) {
                switch (command) {
                    case 'F':
                        return mars.moveForward();
                    case 'B':
                        return mars.moveBackward();
                    case 'L':
                        rover.turnLeft();
                        return position;
                    case 'R':
                        rover.turnRight();
                        return position;
                    case 'D':
                        return mars.dontMove();
                }
            }
            return position;
        }

    public Mars getMars() { return mars; }

    public RoverPosition getPosition() {
        return this.position;
    }
}