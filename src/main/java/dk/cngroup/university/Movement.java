package dk.cngroup.university;

import static dk.cngroup.university.Instruction.DONTMOVE;

public class Movement {
    private Mars mars;
    private Rover rover;
    private Instruction instruction;
    private RoverPosition position;

    public Movement(Mars mars, Rover rover, Instruction instruction, RoverPosition position) {
        this.mars = mars;
        this.rover = rover;
        this.instruction = DONTMOVE;
        this.position = position;
    }

    public RoverPosition startSimulator(String commandChain) {
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
        ;}
        return position;
    }
}