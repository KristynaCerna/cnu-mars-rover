package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.EAST
import static dk.cngroup.university.Direction.SOUTH

class MovementTest extends Specification {

    @Unroll
    "Should move rover to new #position without obstacle"(Direction direction,int x, int y) {

        given:

        def movement = Mock(Movement)

        def rover = new Rover(EAST)

        RandomFieldGenerator generator = Mock(RandomFieldGenerator)
        Landscape landscape = new Landscape(generator, 3)

        def position = new RoverPosition(0, 2)

        def mars = new Mars(rover, landscape, position)

        when:

        movement.startRunSimulator("FFRF")

        then:
        mars.getPosition()

        where:
        direction |x|y
        SOUTH     |2|3

    }
}
