package enums

enum class Directions {
    NORTH {
        override fun next(): Directions {
            return EAST
        }

        override fun prev(): Directions {
            return WEST
        }
    },
    EAST {
        override fun next(): Directions {
            return SOUTH
        }

        override fun prev(): Directions {
            return NORTH
        }
    },
    SOUTH {
        override fun next(): Directions {
            return WEST
        }

        override fun prev(): Directions {
            return EAST
        }
    },
    WEST {
        override fun next(): Directions {
            return NORTH
        }

        override fun prev(): Directions {
            return SOUTH
        }
    };

    abstract fun next(): Directions
    abstract fun prev(): Directions
}