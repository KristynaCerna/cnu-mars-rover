package dk.cngroup.university;

public class Main {

    private static RandomFieldGenerator generator;

    public static void main(String[] args) {
        Rover marsRover = new Rover();
        marsRover.getDirection();
        Landscape marsLandscape = new Landscape(generator, 5);
        RoverPosition marsRoverPosition = new RoverPosition(1, 0);
        Mars simulationMars = new Mars(marsRover, marsLandscape, marsRoverPosition);

        simulationMars.getPosition();

    }
    //Mars marsRover = new Mars(NORTH,5,1,0);
}
