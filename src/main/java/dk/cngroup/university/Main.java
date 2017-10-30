package dk.cngroup.university;

public class Main {


   public static void main(String[] args) {

       String inputFromText = "1,0\n" +
               "\n"    +
               "N \n"  +
               "\n"    +
               "5\n"   +
               "\n"    +
               "..0........0..0.0........" +
               "\n"    +
               "4,0\n" +
               "\n"    +
               "RRFLFRFF";
       SimulatorMovement simulator = new SimulatorMovement(inputFromText);
       boolean result = simulator.reachedFinalPosition();
       System.out.print("Simulation of mars rover reached final position - " + result);



    }

}