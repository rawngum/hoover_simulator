package models

import enums.Directions

class Hoover(var x: Int, var y:Int, var direction: Directions){
    fun rotate() {
        direction = direction.next()
    }

    fun antiRotate() {
        direction = direction.prev()
    }
}