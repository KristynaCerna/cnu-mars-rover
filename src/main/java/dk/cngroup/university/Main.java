package dk.cngroup.university;

public class Main {


    public static void main(String[] args) {

        Input input = new Input(null,null,null, 10);
        {
            input.getInstruction();
            input.printCommands();
            input.printLandscapeSize();
            input.printInitialPosition();
        }
    }

}