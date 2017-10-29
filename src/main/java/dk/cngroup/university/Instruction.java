package dk.cngroup.university;

public enum Instruction {
    FORWARD("F"),
    BACKWARD("B"),
    TURNLEFT("L"),
    TURNRIGHT("R"),
    DONTMOVE("D");

private final String value;

Instruction (String value){
    this.value = value;
}

public final char command() {return this.value.charAt(0);}
}
