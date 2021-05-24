package models

import enums.Directions
import enums.Moves
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.lang.Exception
import kotlin.test.assertFailsWith

internal class RoomTest {
    @Test
    fun testNewGrid(){
        val width = 100
        val height = 200
        val x = 99
        val y = 199
        val direction = Directions.EAST
        var hoover = Hoover(x, y, direction)
        val room = Room(width, height, hoover)
        assertEquals(height, room.height)
        assertEquals(width, room.width)
    }
    @Test
    fun testCannotCreateRoomWithHooverOutOfBound(){
        val width = 100
        val height = 200
        assertFailsWith(
            exceptionClass = Exception::class,
            block = { Room(width, height, Hoover(0, 200, Directions.EAST)) }
        )
        assertFailsWith(
            exceptionClass = Exception::class,
            block = { Room(width, height, Hoover(100, 0, Directions.EAST)) }
        )

        assertFailsWith(
            exceptionClass = Exception::class,
            block = { Room(width, height, Hoover(-1, 199, Directions.EAST)) }
        )
        assertFailsWith(
            exceptionClass = Exception::class,
            block = { Room(width, height, Hoover(99, -1, Directions.EAST)) }
        )
    }
    @Test
    fun testMove(){
        var hoover = Hoover(5, 5, Directions.SOUTH)
        var room = Room(10,10, hoover)
        room.move(Moves.A)
        assertEquals(Pair(5,6), room.getHooverPosition())
    }
}