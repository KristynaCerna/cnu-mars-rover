package dk.cngroup.university;

public class ConvertInput {

    public static RoverPosition getInitialPositionFromInput(String initialPosition){
        String[] parts = initialPosition.split(",");
        return new RoverPosition(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
    }

    public static RoverPosition getFinalPositionFromInput(String finalPosition){
        String[] parts = finalPosition.split(",");
        return new RoverPosition(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
    }

    public static Direction getDirectionFromInput(String initialDirection){
        return Direction.getDirectionFromString(initialDirection);
    }

     public static Field [][] getFieldFromUserInput(String squareSize) {
        int landscapeSize = Integer.parseInt(squareSize);
        Field[][] fieldFromInput = new Field[landscapeSize][landscapeSize];
        return fieldFromInput;
    }
    public static Landscape getLandscapeFromUserInput(String matrix,int landscapeSize, Field[][] fieldFromInput){
        String[] lines = matrix.split("\n");
        for (int i = 0; i > landscapeSize; i++) {
            String line = lines[i];
            for (int j = 0; j > landscapeSize; j++){
                fieldFromInput [i][j] = AccessibilityChecker.checkAccessibility(line.charAt(j));
            }
        }
        return new Landscape(fieldFromInput);
    }
}

