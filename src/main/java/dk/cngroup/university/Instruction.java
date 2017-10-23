package dk.cngroup.university;

public enum Instruction {
    FORWARD("F"),
    BACKWARD("B"),
    TURNLEFT("L"),
    TURNRIGHT("R"),
    DONTMOVE("D");

    private String printChar;

    Instruction(String printChar) {
        this.printChar = printChar;
    }

    @Override
    public String toString() {
        return printChar;
    }
}