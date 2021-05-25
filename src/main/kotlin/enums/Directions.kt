package enums

enum class Directions {
    NORTH ,
    EAST ,
    SOUTH ,
    WEST ;

    open fun prev(): Directions {
        return sibling('-')
    }

    open operator fun next(): Directions {
        return sibling('+')
    }

    private fun sibling(operator: Char): Directions {
        val values = values()
        return when(operator){
            '-' -> values[(ordinal - 1 + values.size) % values.size]
            '+' -> values[(ordinal + 1 + values.size) % values.size]
            else -> throw Exception("Unsupported operator")
        }

    }

}