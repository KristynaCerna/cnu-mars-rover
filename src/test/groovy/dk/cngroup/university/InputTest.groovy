package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*

class InputTest extends Specification {

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
    "should get final Position from input"() {
        given:
        def input = "4,0"

        when:
        def position = ConvertInput.getInitialPositionFromInput(input)

        then:
        position.getX() == 4
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

    @Unroll
    "should get landscape from input size"() {
        given:
        def input = ".0..\n" +
                "..0.\n" +
                ".0.0\n" +
                "...."

        def landscapeSize = 4

        def field = new Field[landscapeSize][landscapeSize]

        when:
        def landscape = ConvertInput.getLandscapeFromUserInput(input, landscapeSize, field)

        then:
        landscape.toString()
        System.out.print(landscape)
    }

    @Unroll
    "should get landscape according to assignment"() {
        def input = "..0..\n" +
                ".....\n" +
                ".0..0\n" +
                ".0...\n" +
                "....."

        def landscapeSize = 5

        def field = new Field[landscapeSize][landscapeSize]

        when:
        def landscape = ConvertInput.getLandscapeFromUserInput(input,landscapeSize,field)

        then:
        landscape.toString()
        System.out.print(landscape)
        }
    }