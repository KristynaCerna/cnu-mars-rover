package dk.cngroup.university;

public class AccessibilityChecker {

    public static Field checkAccessibility(char input) {
        if (input == '.') {
            return Field.ACCESSIBLE;
        } else if (input == '0') {
            return Field.INACCESSIBLE;
        } else { //should never happen
            throw new RuntimeException("unkonwn field input value");
        }
    }
}
