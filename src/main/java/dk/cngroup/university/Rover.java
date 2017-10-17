package dk.cngroup.university;

import java.util.Scanner;

public class Rover {
    private Direction direction;
    private Instruction instruction;

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

    public void runSimulation(String command) {
        movementInstruction
                (Mars, Rover rover, String command);
    }

    public void movementInstruction(Mars mars, Rover rover, String command) {
        for (int i = 0; i < command.length(); i++) {
            switch (instruction) {
                case FORWARD:
                    mars.moveForward();
                    break;
                case BACKWARD:
                    mars.moveBackward();
                    break;
                case TURNLEFT:
                    rover.turnLeft();
                    break;
                case TURNRIGHT:
                    rover.turnRight();
                    break;
            }
            throw new RuntimeException("this command is unknown");
        }
    }

    public String getInstruction() {
        System.out.println("Insert instructions for rover: ");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        return command;
    }
}
