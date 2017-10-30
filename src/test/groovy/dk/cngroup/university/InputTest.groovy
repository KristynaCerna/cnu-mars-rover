package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*

class InputTest extends Specification{

    @Unroll
    "should get #initialPosition from input"(String input, int x, int y){

        expect:
        initialPosition == ConvertInput.getInitialPositionFromInput(input);

        where:
        input |x|y
        "0,1" |0|1
    }

    @Unroll
    "should get #direction from input"(String input,Direction direction){

        expect:
        direction == ConvertInput.getDirectionFromInput(input)

        where:
        input |direction
        "E"   | EAST
        "W"   | WEST
        "N"   | NORTH
        "S"   | SOUTH
    }


}
