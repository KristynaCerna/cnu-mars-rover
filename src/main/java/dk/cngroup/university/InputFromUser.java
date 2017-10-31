/*
package dk.cngroup.university;

import java.util.Scanner;

public class InputFromUser {
    private String commandChain;
    private RoverPosition initialPosition;
    private RoverPosition finalPosition;
    private static int LandscapeSize;
    private String matrix;
    private String initialDirection;



    public InputFromUser(String commandChain, RoverPosition initialPosition, RoverPosition finalPosition,
                         int landscapeSize, String  matrix, String initialDirection) {
        this.commandChain = commandChain;
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
        LandscapeSize = landscapeSize;
        this.matrix = matrix;
        this.initialDirection = initialDirection;
    }

    public void recordInput(){
        landscapeMatrixFromUser();
        landscapeSizeFromUser();
        initialPositionFromUser();
        finalPositionFromUser();
        commandChainFromUser();
        directionFromUser();
    }

    public String commandChainFromUser() {
        System.out.println("Insert instructions for rover: ");
        Scanner sc = new Scanner(System.in);
        commandChain = sc.nextLine();
        return this.commandChain;
    }

    public RoverPosition initialPositionFromUser(){
        System.out.println("Please enter the initial rover position: ");
        Scanner sc = new Scanner(System.in);
        String instruction = sc.nextLine();
        String[] parts = instruction.split(",");
        String x = parts[0].trim().substring(1).trim();
        String y = parts[1].trim().substring(0,parts[1].trim().length()-1).trim();
        return new RoverPosition(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
    }

    public RoverPosition finalPositionFromUser(){
        System.out.println("Please enter the final rover position: ");
        Scanner sc = new Scanner(System.in);
        String instruction = sc.nextLine();
        String[] parts = instruction.split(",");
        String x = parts[0].trim().substring(1).trim();
        String y = parts[1].trim().substring(0,parts[1].trim().length()-1).trim();
        return new RoverPosition(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]));
    }

    public int landscapeSizeFromUser(){
        System.out.println("Enter the size of your simulation landfield: ");
        Scanner sc = new Scanner(System.in);
        String size = sc.nextLine();
        int landscapeSize = Integer.parseInt(size);
        return landscapeSize;
    }

    public String landscapeMatrixFromUser(){
        System.out.println("Enter of matrix of test landscape: ");
        Scanner sc = new Scanner(System.in);
        matrix = sc.nextLine();
        return matrix;
    }

    public String directionFromUser(){
        System.out.println("Enter of matrix of test landscape: ");
        Scanner sc = new Scanner(System.in);
        initialDirection = sc.nextLine();
        return initialDirection;
    }

    public String getCommandChain() {
        return commandChain;
    }

    public RoverPosition getInitialPosition() {
        return initialPosition;
    }

    public RoverPosition getFinalPosition() {
        return finalPosition;
    }

    public int getLandscapeSize() {
        return LandscapeSize;
    }

    public String getMatrix() { return matrix; }

    public String getInitialDirection() {
        return initialDirection;
    }

    //refactor to one input into one print method
    public void printCommandChain(){
        System.out.println("Command input is " + commandChain  + "\n");
    }

    public void printLandscapeSize(){ System.out.println("Landscape size is set to " + LandscapeSize + "\n"); }

    public void printInitialPosition(){ System.out.println("Rover is on initial position " + initialPosition  + "\n"); }

    public void printFinalPosition() {System.out.println("Rover reached final position " + finalPosition + "\n");}

    public void printmatrixChar() { System.out.print("Landscape matrix is " + matrix + "\n");}
}*/
