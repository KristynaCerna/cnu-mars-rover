package dk.cngroup.university;

 public class MovementSimulator {

    private Mars mars;
    private Rover rover;
    private Landscape landscape;
    private RoverPosition position;
    private RoverPosition initialPosition, finalPosition;
    private String inputFromText;
    private String commandChain;
    private String[] lines;


    public MovementSimulator(Mars mars, Rover rover, Landscape landscape, RoverPosition position) {
        this.mars = mars;
        this.rover = rover;
        this.landscape = landscape;
        this.position = position;
    }

    public boolean reachedFinalPosition(){
        System.out.print("Initial position is " + initialPosition + "\n"); // Used to check if simulator is working
        moveRover(commandChain);
        System.out.print(position);
        return finalPosition.equals(mars.getPosition());
    }

    public MovementSimulator(String inputFromText){
        this.inputFromText = inputFromText;
        obtainInputData();
    }

        public void obtainInputData(){

            String[] lines = inputFromText.split("\\n");


            /*System.out.print("System received input : "+ "\n" + lines[0] + "\n" + lines[1] + "\n" + lines[2] + "\n"
                                                              + lines[3] + "\n" + lines[4] + "\n" + lines[5] + "\n"
                                                              + lines[6] + "\n" + lines[7] + "\n" + lines[8] + "\n"
                                                              + lines[9] + "\n" + lines[10] + "\n" + lines[11] + "\n"
                                                              + lines[12] + "\n" + lines[13] + "\n"+ lines[14] + "\n");*/

            String ip = lines[0];
            String d = lines[2];
            String ls = lines[4];
            System.out.print(0);

            initialPosition = ConvertInput.getInitialPositionFromInput(lines[0]);

            System.out.print("\n" + initialPosition + "\n");

            Direction direction = ConvertInput.getDirectionFromInput(lines[2]);
            rover = new Rover(direction);

            System.out.print("\n" + direction + "\n");

            int landscapeSize = Integer.parseInt(lines[4]);
            Field[][] field = new Field[landscapeSize][landscapeSize];
            String matrix = "";
            for (int i = 0; i > landscapeSize; i++)
                 matrix += lines[4 + i] + "\n";
            landscape = ConvertInput.getLandscapeFromUserInput(matrix,landscapeSize,field);

            System.out.print("\n" + landscapeSize + "\n");

            mars = new Mars(rover,landscape, initialPosition);

            finalPosition = ConvertInput.getFinalPositionFromInput(lines[12]);

            System.out.print("\n" + finalPosition + "\n");

            commandChain = lines [14];

            System.out.print("\n" + commandChain + "\n");

        }

        public RoverPosition moveRover(String commandChain) {
            char[] commands = commandChain.toCharArray();
            for (char command : commands) {
                switch (command) {
                    case 'F':
                        mars.moveForward();
                        break;
                    case 'B':
                        mars.moveBackward();
                        break;
                    case 'L':
                        rover.turnLeft();
                        break;
                    case 'R':
                        rover.turnRight();
                        break;
                    case 'D':
                        mars.dontMove();
                        break;
                }
            }
            return position;
        }

    public Mars getMars() { return mars; }

    public RoverPosition getPosition() {
        return this.position;
    }




}