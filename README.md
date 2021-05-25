# hoover_simulator

Ce projet simule le déplacement d'un aspirateur dans une pièce de taille configurable à partir d'une série d'instruction.

## Utilisation

```
        var hoover = Hoover(5, 5, Directions.NORTH)
        var room = Room(10,10, hoover)
        room.move(Moves.D, Moves.A, Moves.D, Moves.A,Moves.D,Moves.A,Moves.D,Moves.A,Moves.A)
        
        assertEquals(Pair(5,6), room.getHooverPosition())
        assertEquals(Directions.NORTH, room.getHooverDirection())
```

Pour plus d'informations, voir les fichiers de test dans src/test/kotlin.
