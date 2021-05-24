package models

import java.lang.Exception

class Room(val width: Int, val height: Int, val hoover: Hoover) {
    init {
        if (!(0 until width).contains(hoover.x) || !(0 until height).contains(hoover.y)){
            throw Exception("Hoover is out of bound")
        }
    }
}