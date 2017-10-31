package dk.cngroup.university;

public enum Field {
    ACCESSIBLE(".","."),
    INACCESSIBLE("0","0");

    private final String value;
    private String printChar;

    Field(String printChar, String value) {
        this.printChar = printChar;
        this.value = value;
    }

    @Override
    public String toString() { return printChar; }


    public static Field getFieldFromInput(char input){
        switch(input){
            case '.':
                return ACCESSIBLE;
            case '0':
                return INACCESSIBLE;
        }
        //should never happen
        throw new RuntimeException("unkonwn field input value");
    }
}
