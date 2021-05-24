package models

import java.lang.Exception

class Room(val width: Int, val height: Int, val hoover: Hoover) {
    init {
        if (hoover.x > width || hoover.y > height ){
            throw Exception("Hoover is out of bound")
        }
    }
}