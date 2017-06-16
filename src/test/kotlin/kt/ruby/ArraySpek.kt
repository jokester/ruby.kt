package kt.ruby

import junit.framework.Assert.assertEquals
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
    given("immutable list / array") {
        val lists = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)

        on(" methods / property ") {
            it("should be the 3rd element of list/array") {
                assertTrue(lists.at(3) == 4)
                assertTrue(array.at(3) == 4)
            }

            it("should be the default value when fetch out of range") {
                assertTrue(lists.fetch(3, 100) == 4)
                assertTrue(array.fetch(3, 100) == 4)
                assertEquals(lists.fetch(100, 2000), 2000)
            }

            it("should report size") {
                assertEquals(lists.length, lists.size)
                assertEquals(array.length, array.size)

                assertEquals(lists.include(4), true)
                assertEquals(lists.include(10), false)
            }
        }
    }


    given("mutable list") {
        on("methods / property ") {
            it("should add 100 ") {
                val lists = mutableListOf(1, 2, 3, 4, 5, 6, 7)
                lists.push(100)
                assertTrue(lists.last() == 100)

                lists lsh 101
                assertTrue(lists.last() == 101)

                lists.unshift(0)
                assertTrue(lists.first() == 0)

                val pop = lists.pop()
                assertEquals(pop, 101)
                assertEquals(lists.size, 9)

                val shift = lists.shift()
                assertEquals(shift, 0)
                assertEquals(lists.size, 8)

                val deleteAt = lists.deleteAt(2)
                assertEquals(deleteAt, 3)
                assertEquals(lists.size, 7)

                lists.add(4)
                lists.unshift(4)
                lists.lsh(4)
                lists.delete(4)
                assertEquals(lists.length, 9)
            }

            it("should trim all null for mutable") {
                val mutableListOf = mutableListOf(1, 2, 3, 4, 5, null, 6, null)
                mutableListOf.compact()
                val contains = mutableListOf.contains(null)
                assertTrue(!contains)
            }

            it("should return arrays/lists without null") {
                val list = listOf(1, 2, 3, 4, 5, 6, null, 7, 8, null, 9)
                val array = arrayOf(1, 2, 3, 4, 5, 6, null, 7, 8, null, 9)

                val compactList = list.compact()
                val compactArray = array.compact()

                assertTrue(!compactList.contains(null))
                assertTrue(!compactArray.contains(null))
            }
        }
    }
})
