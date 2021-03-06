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
        throw new RuntimeException("unkown world side value");
    }

}
