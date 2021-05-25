package models

import enums.Directions
import enums.Moves
import java.lang.Exception

class Room(val width: Int, val height: Int, val hoover: Hoover) {

    init {
        if (!isInBound(hoover.x, hoover.y)){
            throw Exception("Hoover is out of bound")
        }
    }

    fun move(vararg moves: Moves){
        for (move in moves)
            when(move){
                Moves.A -> forward()
                Moves.D -> hoover.rotate()
                Moves.G -> hoover.antiRotate()
            }
    }

    private fun forward() {
        val x = hoover.x
        val y = hoover.y
        when(hoover.direction){
            Directions.NORTH -> if(isInBound(x, y + 1)) hoover.y++
            Directions.SOUTH -> if(isInBound(x, y - 1)) hoover.y--
            Directions.WEST -> if(isInBound(x + 1, y)) hoover.x++
            Directions.EAST -> if(isInBound(x - 1, y )) hoover.x--
        }
    }

    private fun isInBound( x: Int, y: Int): Boolean {
        return (0 until width).contains(x) && (0 until height).contains(y)
    }

    fun getHooverPosition(): Pair<Int, Int> {
        return Pair(hoover.x, hoover.y)
    }

    fun getHooverDirection(): Directions {
        return hoover.direction
    }
}