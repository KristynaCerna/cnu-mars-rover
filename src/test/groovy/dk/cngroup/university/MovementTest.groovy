package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*
import static dk.cngroup.university.Field.ACCESSIBLE
import static dk.cngroup.university.Field.INACCESSIBLE
import static dk.cngroup.university.Instruction.DONTMOVE

class MovementTest extends Specification {

    @Unroll
    "Should move rover to new #position without obstacle"(Direction direction, int x, int y) {

        given:


        def rover = Mock(Rover)
        rover.getDirection() >>>direction

        Landscape landscape = new Landscape(LandscapeTest.testLandscape)

        def position = new RoverPosition(1, 1)

        def mars = new Mars(rover, landscape, position)

        def movement = new Movement(mars, rover, DONTMOVE, position)

        when:

        def newPosition = movement.startSimulator("F")

        then:

        newPosition == mars.getPosition()


        where:
        direction |x|y
        WEST     |1|0
        EAST     |2|1
        SOUTH    |1|2
        NORTH    |0|1

    }

    @Unroll
    "should move rover to new #position with obstacle" (Direction direction,int x, int y){

        def rover = new Rover(EAST)

        RandomFieldGenerator generator = Mock(RandomFieldGenerator)
        generator.getRandomField() >>> [INACCESSIBLE,INACCESSIBLE,ACCESSIBLE]

        Landscape landscape = new Landscape(generator,3)

        def position = new RoverPosition(1, 1)

        def mars = new Mars(rover, landscape, position)

        def movement = new Movement(mars, rover, DONTMOVE, position)

        when:

        movement.startSimulator("FFRF")

        then:
        mars.getPosition()

        where:
        direction |x|y
        SOUTH     |2|3

    }
}
