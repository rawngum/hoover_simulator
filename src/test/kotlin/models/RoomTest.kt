package models

import enums.Directions
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
        var hover = Hoover(x, y, direction)
        val room = Room(width, height, hover)
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
}