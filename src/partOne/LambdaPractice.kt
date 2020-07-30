package partOne

import kotlin.random.Random

fun main (){

    val rollDice = { Random.nextInt(12)}
    val rollDice2: (Int) -> Int = {sides -> if (sides == 0) 0 else Random.nextInt(sides)}
    val rollDice3 = { sides: Int -> if (sides != 0) {Random.nextInt(0,sides)} else 0 }

//    rollDice()
//    rollDice3(20)
//    rollDice2(6)

    fun gameplay(diceRoll: Int) {println(diceRoll)}

    gameplay(rollDice2(4))
}