package models

import enums.Direction
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.lang.Exception
import java.lang.NumberFormatException
import kotlin.test.assertFailsWith

internal class RoomTest {
    @Test
    fun testNewGrid(){
        val width = 100
        val height = 200
        val x = 100
        val y = 3
        val direction = Direction.EAST
        var hover = Hoover(x, y, direction)
        val room = Room(width, height, hover)
        assertEquals(height, room.height)
        assertEquals(width, room.width)
    }
    @Test
    fun testCannotCreateRoomWithHooverOutOfBound(){
        val width = 100
        val height = 200
        val x = 100
        val y = 201
        val direction = Direction.EAST
        var hover = Hoover(x, y, direction)
        assertFailsWith(
            exceptionClass = Exception::class,
            block = { Room(width, height, hover) }
        )
    }
}