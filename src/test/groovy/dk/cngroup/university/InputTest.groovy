package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*

class InputTest extends Specification{

    @Unroll
    "should get initial Position from input"() {

        given:
        def input = "1,0"

        when:
        def position = ConvertInput.getInitialPositionFromInput(input)

        then:
        position.getX() == 1
        position.getY() == 0

    }

        @Unroll
        "should get #direction from input"(String input, Direction direction) {

            expect:
            direction == ConvertInput.getDirectionFromInput(input)

            where:
            input | direction
            "E"   | EAST
            "W"   | WEST
            "N"   | NORTH
            "S"   | SOUTH
        }
    }