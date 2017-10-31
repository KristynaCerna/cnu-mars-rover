package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*

class movementSimulatorTest extends Specification {

    @Unroll
    "Should move rover to new #position without obstacle"(Direction direction, int x, int y) {

        given:


        def rover = Mock(Rover)
        rover.getDirection() >>>direction

        Landscape landscape = new Landscape(LandscapeTest.testLandscape)

        def position = new RoverPosition(1, 1)

        def mars = new Mars(rover, landscape, position)

        def movement = new movementSimulator(mars, rover, landscape,position)
        when:

        def newPosition = movement.moveRover("B")

        then:

        x == newPosition
                .getX()

        y == newPosition
                .getY()


        where:
        direction |x|y
        WEST     |2|1
        EAST     |0|1
        SOUTH    |1|0
        NORTH    |1|2

    }

    @Unroll
    "Should move rover by two to new #position without obstacle"(Direction direction, int x, int y) {

        given:


        def rover = Mock(Rover)
        rover.getDirection() >>>direction

        Landscape landscape = new Landscape(LandscapeTest.testLandscape)

        def position = new RoverPosition(1, 1)

        def mars = new Mars(rover, landscape, position)

        def movement = new movementSimulator(mars, rover, landscape,position)

        when:

        def newPosition = movement.moveRover("F")

        then:

        x == newPosition
                .getX()

        y == newPosition
                .getY()


        where:
        direction |x|y
        EAST     |2|1
        SOUTH    |1|2
    }

    @Unroll
    "should obtain input data"() {
        given:

        def inputFromText = "1,0\n" +
                "\n" +
                "N" +
                "\n" +
                "5\n" +
                "\n" +
                "..0..\n" +
                ".....\n" +
                ".0..0\n" +
                ".0...\n" +
                ".....\n" +
                "\n" +
                "2,4" +
                "\n" +
                "RRFLFRFF"

        def movementSimulator = new movementSimulator(inputFromText)

        when:

        movementSimulator.obtainInputData()

        def mars = new Mars(rover, landscape, position)

        then:

        mars.getPosition().getX() == 1
        mars.getPosition().getY() == 0

    }
}
