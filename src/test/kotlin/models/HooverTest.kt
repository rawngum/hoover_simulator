package models

import enums.Directions
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class HooverTest{
    @Test
    fun testNewHover(){
        val x = 100
        val y = 3
        val direction = Directions.EAST
        var hover = Hoover(x, y, direction)
        assertEquals(x, hover.x)
        assertEquals(y, hover.y)
        assertEquals(direction, hover.directions)
    }
}