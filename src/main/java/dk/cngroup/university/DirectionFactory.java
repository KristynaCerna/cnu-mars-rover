package dk.cngroup.university;

public class DirectionFactory {

    public static Direction getDirection(WorldSide side) {
        switch (side) {
            case NORTH:
                return Direction.NORTH;
            case EAST:
                return Direction.EAST;
            case SOUTH:
                return Direction.SOUTH;
            case WEST:
                return Direction.WEST;
        }
        //should never happen
        throw new RuntimeException("unkonwn world side value");
    }

    public static Direction getDirectionFromString(String directionString){
        switch(directionString){
            case "N":
                return Direction.NORTH;
            case "E":
                return Direction.EAST;
            case "S":
                return Direction.SOUTH;
            case "W":
                return Direction.WEST;
        }
        //should never happen
        throw new RuntimeException("unkonwn world side value");
    }
}
