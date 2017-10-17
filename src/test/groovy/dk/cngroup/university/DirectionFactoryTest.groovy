package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

class DirectionFactoryTest extends Specification {

    @Unroll
    "Should turn #direction from #worldSide"(Direction direction, WorldSide worldSide) {
        expect:
        direction == DirectionFactory
        .getDirection(worldSide)

        where:
        direction       | worldSide
        Direction.NORTH | WorldSide.NORTH
        Direction.SOUTH | WorldSide.SOUTH
        Direction.WEST  | WorldSide.WEST
        Direction.EAST  | WorldSide.EAST
    }

    @Unroll
    "should throw exception when null"() {
        when:
        DirectionFactory.getDirection(side:null)

    then:
        RuntimeException ex = thrown()
        }
}
