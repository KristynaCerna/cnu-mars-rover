package dk.cngroup.university;

public enum Direction {
    NORTH(WorldSide.EAST, WorldSide.WEST),
    EAST(WorldSide.SOUTH, WorldSide.NORTH),
    SOUTH(WorldSide.WEST, WorldSide.EAST),
    WEST(WorldSide.NORTH, WorldSide.SOUTH);


    private WorldSide rightOf;
    private WorldSide leftOf;

    Direction(WorldSide rightOf, WorldSide leftOf) {
        this.rightOf = rightOf;
        this.leftOf = leftOf;
    }

    public Direction getRightOf() {
        return DirectionFactory.getDirection(rightOf);
    }

    public Direction getLeftOf() {
        return DirectionFactory.getDirection(leftOf);
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
        throw new RuntimeException("unkown world side value");
    }
}
