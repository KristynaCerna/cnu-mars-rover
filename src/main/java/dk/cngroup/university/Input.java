package dk.cngroup.university;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    private String commandChain;
    private String initialPosition;
    private String finalPosition;
    private int LandscapeSize;
    private String matrix;
    private String initialDirection;

    public Input(String inputFromText){

        Pattern pattern = Pattern.compile("(\\d,\\d)\\n\\n(.)\\n\\n(\\p{Upper})\\n\\n([\\n\\d.]*)?\\n\\n(\\d\\d)\\n\\n(\\p{Upper})");
        Matcher matcher = pattern.matcher(inputFromText);
        matcher.find();

        initialPosition = matcher.group(1);
        initialDirection = matcher.group(2);
        LandscapeSize = Integer.parseInt(matcher.group(3));
        matrix = matcher.group(4);
        finalPosition = matcher.group(5);
        commandChain = matcher.group(6);
    }



    public String getInitialPosition() { return initialPosition; }

    public String getCommandChain() { return commandChain; }

    public String getFinalPosition() { return finalPosition; }

    public int getLandscapeSize() { return LandscapeSize; }

    public String getMatrix() { return matrix; }

    public String getInitialDirection() { return initialDirection; }
}


