package dk.cngroup.university;

public class Main {


   public static void main(String[] args) {

       String inputFromText = "1,0\n" +
               "\n"    +
               "N\n"  +
               "\n"    +
               "5\n"   +
               "\n"    +
               "..0..\n" +
               ".....\n" +
               ".0..0\n" +
               ".0...\n" +
               ".....\n" +
               "\n"    +
               "4,0\n" +
               "\n"    +
               "RRFLFRFF";

       MovementSimulator simulator = new MovementSimulator(inputFromText);
       boolean result = simulator.reachedFinalPosition();
       System.out.print("Simulation of mars rover reached final position - " + result);



    }

}