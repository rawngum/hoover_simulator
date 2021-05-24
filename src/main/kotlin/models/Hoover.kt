package models

import enums.Directions

class Hoover(var x: Int, var y:Int, var directions: Directions){
    fun rotate() {
        directions = directions.next()
    }

    fun antiRotate() {
        directions = directions.prev()
    }
}