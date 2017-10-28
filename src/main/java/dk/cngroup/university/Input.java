package dk.cngroup.university;

import java.util.Scanner;

public class Input {
    private String commandChain;
    private RoverPosition initialPosition;
    private RoverPosition finalPosition;
    private int LandscapeSize;



    public Input(String commandChain, RoverPosition initialPosition, RoverPosition finalPosition, int landscapeSize) {
        this.commandChain = commandChain;
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
        LandscapeSize = landscapeSize;
    }

    public String getInstruction() {
        System.out.println("Insert instructions for rover: ");
        Scanner sc = new Scanner(System.in);
        commandChain = sc.nextLine();
        return this.commandChain;
    }

    //refactor to one input into one print method
    public void printCommands(){
        System.out.println("Command input is " + commandChain  + "\n");
    }

    public void printLandscapeSize(){ System.out.println("Landscape size is set to " + LandscapeSize + "\n"); }

    public void printInitialPosition(){
        System.out.println("Rover is on initial position " + finalPosition  + "\n");
    }
}