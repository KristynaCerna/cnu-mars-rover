package dk.cngroup.university;

import java.util.Scanner;

public class Input {
    private String commandChain;
    private RoverPosition initialPosition;
    private RoverPosition finalPosition;
    private int LanscapeSize;
    public String coordinates; 


    public Input(String commandChain, RoverPosition initialPosition, RoverPosition finalPosition, int lanscapeSize, String coordinates) {
        this.commandChain = commandChain;
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
        LanscapeSize = lanscapeSize;
        this.coordinates = coordinates;
    }

    public String getInstruction() {
        System.out.println("Insert instructions for rover: ");
        Scanner sc = new Scanner(System.in);
        String commandChain = sc.nextLine();
        return this.commandChain;
    }
    public String getInitialPosition(){
        System.out.println("Please enter the initial rover position: ");
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.nextLine();
        return this.coordinates;
    }

    public RoverPosition convertPosition(RoverPosition initialPosition) {
        String coordinate = this.coordinates;
        String[] parts = coordinate.split(",");
        String xString = parts[0].trim().substring(1).trim();
        String yString = parts[1].trim().substring(0, parts[1].trim().length() - 1).trim();
        int x = Integer.parseInt(xString);
        int y = Integer.parseInt(yString);
        new RoverPosition(initialPosition.setX(x),initialPosition.setY(y));
        return this.initialPosition;
    }

    public int getLanscapeSize(){
        System.out.println("Enter the size of your simulation landfield: ");
        Scanner sc = new Scanner(System.in);
        String size = sc.nextLine();
        int landscapeSize = Integer.parseInt(size);
        return landscapeSize;
    }


}