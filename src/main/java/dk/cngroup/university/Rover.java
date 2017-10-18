package dk.cngroup.university;

import java.util.Scanner;

public class Rover {
    private Direction direction;
    private Instruction instruction;
    private Mars mars;

    public Rover() {
        direction = Direction.NORTH;
    }

    public Rover(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public Rover turnLeft() {
        return new Rover(direction.getLeftOf());
    }

    public Rover turnRight() {
        return new Rover(direction.getRightOf());
    }

    public String getInstruction() {
        System.out.println("Insert instructions for rover: ");
        Scanner sc = new Scanner(System.in);
        String commandChain = sc.nextLine();
        return commandChain;
    }
}
