package dk.cngroup.university;

import java.util.ArrayList;

import static dk.cngroup.university.Field.ACCESSIBLE;
import static dk.cngroup.university.Field.INACCESSIBLE;

public class Landscape {

    private Field[][] landscape;
    private RandomFieldGenerator generator;

    public Landscape(Field[][] landscape) {
        this.landscape = landscape;
    }

    public Landscape(RandomFieldGenerator generator,
                     int squareSize) {
        this.generator = generator;
        this.landscape = createLandscape(squareSize);
    }

    public Landscape(String matrix, int landscapeSize) {
        this.landscape = createLandscapeFromUserInput(matrix,landscapeSize);
    }

    public Field[][] getLandscape() {
        return landscape;
    }

    private Field[][] createLandscape(int squareSize) {
        Field[][] landscape = new
                Field[squareSize][squareSize];
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                landscape[i][j] = generator.getRandomField();
            }
        }
        return landscape;
    }

    public Field [][] createLandscapeFromUserInput(String landscapeMatrix, int squareSize){

        ArrayList<Field> fieldList = getLandscapefromMatrixList(landscapeMatrix, squareSize);

        Field[][] landscape = new Field[squareSize][squareSize];

        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++){
                landscape [i][j] = fieldList.get(0);
          }
        }
        return landscape;
    }

    private ArrayList<Field> getLandscapefromMatrixList(String landscapeMatrix, int squareSize){

        ArrayList<Field> fieldInput = new ArrayList<>();

        String [] value = landscapeMatrix.split(" ");
        for (String inputKey : value){
            if (inputKey == ".") {
                fieldInput.add(ACCESSIBLE);
            }else{
                fieldInput.add(INACCESSIBLE);
            }
        }
        return fieldInput;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Field[] row : landscape) {
            for (Field field : row) {
                sb.append(field);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isFieldAccessible(RoverPosition pos) {
        if (pos.getX() < 0
                || pos.getY() < 0) {
            return false;
        }

        if (pos.getX() >= landscape.length) {
            return false;
        }
        if (pos.getY() >= landscape.length) {
            return false;
        }
        Field field = landscape[pos.getX()][pos.getY()];
        return field == ACCESSIBLE;
    }

}
