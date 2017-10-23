package dk.cngroup.university;

import static dk.cngroup.university.Instruction.DONTMOVE;

public class Movement {
    private Mars mars;
    private Rover rover;
    private Instruction instruction;

    public Movement(Mars mars, Rover rover, Instruction instruction) {
        this.mars = mars;
        this.rover = rover;
        this.instruction = DONTMOVE;
    }

    public void startRunSimulator(String commandChain) {
        movementInstruction(commandChain);
    }

    public void movementInstruction(String commandChain) {
        for (int i = 0; i < commandChain.length(); i++) {
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
                case DONTMOVE:
                    mars.dontMove();
                    break;
            }
        }
    }
}