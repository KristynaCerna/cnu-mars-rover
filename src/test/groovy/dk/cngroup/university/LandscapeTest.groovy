package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Field.ACCESSIBLE
import static dk.cngroup.university.Field.INACCESSIBLE

class LandscapeTest extends Specification{

    def static Field[][] testLandscape = [
            [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE],
            [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE],
            [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE]
    ]

    @Unroll
    "should create landscape"(){
        given:
            RandomFieldGenerator generator = Mock(RandomFieldGenerator)
            9 * generator.getRandomField() >> ACCESSIBLE

            Landscape landscape = new Landscape(generator, 3, userGenerator)

        expect:
            landscape.getLandscape()== testLandscape
    }

    def"should print to string"(){
        given:
        RandomFieldGenerator generator = Mock(RandomFieldGenerator)
        generator.getRandomField() >>> [INACCESSIBLE,INACCESSIBLE,ACCESSIBLE]

        Landscape landscape = new Landscape(generator, 3, userGenerator)

        when:
        String result = landscape.toString()

        then:
        result == """00.
                  ...
                  ...
                  """
    }

    @Unroll
    "shold return #isAccessible for #position" (boolean isAccessible, int x, int y) {
        given:
        RandomFieldGenerator generator = Mock(RandomFieldGenerator)
        generator.getRandomField() >>>
                [INACCESSIBLE,INACCESSIBLE, ACCESSIBLE]

        Landscape landscape = new Landscape(generator, 3, userGenerator)

        def position = new RoverPosition(x,y)

        expect:
        isAccessible == landscape.isFieldAccessible(position)

        where:
        isAccessible |x|y
        false |0|0
        false |0|1
        true  |0|2
        true  |1|0
        false |3|3
        false |-1|6
    }
}
