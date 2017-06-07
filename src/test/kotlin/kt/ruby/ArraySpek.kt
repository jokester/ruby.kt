package kt.ruby

import junit.framework.Assert.assertTrue
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by natsuki on 07/06/2017.
 */

@RunWith(JUnitPlatform::class)
class ArraySpek : Spek({
    given("element access") {
        val lists = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)

        on("at") {
            it("should be the 3rd element of list/array") {
                assertTrue(lists.at(3) == 4)
                assertTrue(array.at(3) == 4)
            }
        }
    }
})

