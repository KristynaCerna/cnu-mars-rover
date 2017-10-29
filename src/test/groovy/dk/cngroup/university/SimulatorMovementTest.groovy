package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*

class SimulatorMovementTest extends Specification {

    @Unroll
    "Should move rover to new #position without obstacle"(Direction direction, int x, int y) {

        given:


        def rover = Mock(Rover)
        rover.getDirection() >>>direction

        Landscape landscape = new Landscape(LandscapeTest.testLandscape)

        def position = new RoverPosition(1, 1)

        def mars = new Mars(rover, landscape, position)

        def movement = new SimulatorMovement(mars, rover, position, initialPosition, null)

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

        def movement = new SimulatorMovement(mars, rover, position, initialPosition, null)

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


}
