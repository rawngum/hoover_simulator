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
    @Test
    fun testRotateHover(){
        var hover = Hoover(12, 12, Directions.SOUTH)
        hover.rotate()
        hover.rotate()
        hover.rotate()
        assertEquals(Directions.EAST, hover.directions)
        hover.antiRotate()
        hover.antiRotate()
        hover.antiRotate()
        hover.antiRotate()
        hover.antiRotate()
        assertEquals(Directions.NORTH, hover.directions)
    }

}