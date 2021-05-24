package models

import enums.Direction
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class HooverTest{
    @Test
    fun testNewHover(){
        val x = 100
        val y = 3
        val direction = Direction.EAST
        var hover = Hoover(x, y, direction)
        assertEquals(x, hover.x)
        assertEquals(y, hover.y)
        assertEquals(direction, hover.direction)
    }
}