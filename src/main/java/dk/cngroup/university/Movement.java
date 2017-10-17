package dk.cngroup.university;

public class Movement {
    private Mars mars;
    private Rover rover;
    private Instruction instruction;

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
            }
            throw new RuntimeException("this command is unknown");
        }
    }
}
