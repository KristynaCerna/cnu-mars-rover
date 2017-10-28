package dk.cngroup.university;

public class RoverPositionFactory {

    public static RoverPosition getForwardPosition(RoverPosition position, Direction direction) {
        switch (direction) {
            case NORTH:
                return new RoverPosition(position.getX(), position.getY() - 1);
            case SOUTH:
                return new RoverPosition(position.getX(), position.getY() + 1);
            case EAST:
                return new RoverPosition(position.getX() + 1, position.getY());
            case WEST:
                return new RoverPosition(position.getX() - 1, position.getY());
        }
        return position;
    }

    public static RoverPosition getBackwardPosition(RoverPosition position, Direction direction) {
        switch (direction) {
            case NORTH:
                return new RoverPosition(position.getX(), position.getY() + 1);
            case SOUTH:
                return new RoverPosition(position.getX(), position.getY() - 1);
            case EAST:
                return new RoverPosition(position.getX() - 1, position.getY());
            case WEST:
                return new RoverPosition(position.getX() + 1, position.getY());
        }
        return position;
    }

    public static RoverPosition getDontMove(RoverPosition position, Direction direction){
        return new RoverPosition(position.getX(), position.getY());
    }


    public static RoverPosition getPosition(RoverPosition initialPosition) {
        return position;
    }
}
