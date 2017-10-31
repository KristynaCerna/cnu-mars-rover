package dk.cngroup.university;

public class ConvertInput {

    public static RoverPosition getInitialPositionFromInput(String initialPosition){
        String[] parts = initialPosition.split(",");

        return new RoverPosition(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
    }

    public static RoverPosition getFinalPositionFromInput(String finalPosition){
        String[] parts = finalPosition.split(",");
        String x = parts[0].trim().substring(1).trim();
        String y = parts[1].trim().substring(0,parts[1].trim().length()-1).trim();
        return new RoverPosition(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
    }

    public static Direction getDirectionFromInput(String initialDirection){
        return DirectionFactory.getDirectionFromString(initialDirection);
    }

     public static Field [][] getFieldFromUserInput(int squareSize) {
        Field[][] fieldFromInput = new
                Field[squareSize][squareSize];
        return fieldFromInput;
    }

    public static Landscape getLandscapeFromUserInput(String matrix,int squareSize, Field[][] fieldFromInput){
        String[] lines = matrix.split(" ");
        for (int i = 0; i < squareSize; i++) {
            String lineOfField = lines[i];
            for (int j = 0; j < squareSize; j++){
                fieldFromInput [i][j] = Field.getFieldFromInput(lineOfField.charAt(j));
            }
        }
        return new Landscape(fieldFromInput);
    }
}

