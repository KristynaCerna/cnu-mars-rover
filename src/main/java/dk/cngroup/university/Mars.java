package dk.cngroup.university;

import java.util.Scanner;

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
                .getDontMove(position);
        return position;
    }

    public RoverPosition getPosition() {
        return position;
    }

    public String getInstruction() {
        System.out.println("Insert instructions for rover: ");
        Scanner sc = new Scanner(System.in);
        String commandChain = sc.nextLine();
        return commandChain;
    }


    // public void printRoverPosition(){
    //   System.out.println(this.position + ".");
    //}


}
