package dk.cngroup.university;

public class Mars {
    private Rover rover;
    private Landscape landscape;
    private RoverPosition position;


    public Mars(Rover rover, Landscape landscape, RoverPosition position) {
        this.rover = rover;
        this.landscape = landscape;
        this.position = position;
    }

    public RoverPosition moveForward() {
        RoverPosition forwardPosition = RoverPositionFactory
                .getForwardPosition(position, rover.getDirection());
        if (landscape.isFieldAccessible(forwardPosition)) {
            return forwardPosition;
        } else {
            return position;
        }
    }

    public RoverPosition moveBackward() {
        RoverPosition backwardPosition = RoverPositionFactory
                .getBackwardPosition(position, rover.getDirection());
        if (landscape.isFieldAccessible(backwardPosition)) {
            return backwardPosition;
        } else {
            return position;
        }
    }

    public RoverPosition dontMove(){
        RoverPosition dontMove = RoverPositionFactory
                .getDontMove(position, rover.getDirection());
        return position;
    }

    public RoverPosition getPosition() {
        return position;
    }

    public RoverPosition getDontMovePosition(){
        return RoverPositionFactory.getDontMove(position,rover.getDirection());
    }

    public Rover getRover() { return rover; }

    public void setRover(Rover rover) { this.rover = rover; }

    public Landscape getLandscape() { return landscape; }



    // public void printRoverPosition(){
    //   System.out.println(this.position + ".");
    //}


}
