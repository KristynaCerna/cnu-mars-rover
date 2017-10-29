package dk.cngroup.university;

public class Input {

    private String commandChain;
    private String initialPosition;
    private String finalPosition;
    private static int LandscapeSize;
    private String matrix;
    private String initialDirection;

    public Input(String inputFromText){
        String[] lines = inputFromText.split("\\r?\\n");

        initialPosition = lines[0];
        finalPosition = lines[1];
        LandscapeSize = Integer.parseInt(lines[3]);
        matrix = lines[4].replaceAll("\n", "");
        initialDirection = lines[5];
        commandChain = lines[6];


    }

    public String getCommandChain() { return commandChain; }

    public RoverPosition getInitialPosition() { return initialPosition; }

    public RoverPosition getFinalPosition() { return finalPosition; }

    public static int getLandscapeSize() { return LandscapeSize; }

    public String getMatrix() { return matrix; }

    public String getInitialDirection() { return initialDirection; }
}


