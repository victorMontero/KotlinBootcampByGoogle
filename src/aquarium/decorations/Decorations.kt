package aquarium.decorations

fun main (){
    makeDecorations()
}

fun makeDecorations() {
    val decoOne = Decorations("granite")
    println(decoOne)

    val decoTwo = Decorations("marble")
    println(decoTwo)

    val decoThree = Decorations("marble")
    println(decoThree)

    println(decoOne.equals(decoTwo))
    println(decoThree.equals(decoTwo))

    val decoFour = decoThree.copy()
    println(decoFour)
    println(decoThree)

    val decoFive = DecorationsTwo("crystal", "wood", "diver")
    println(decoFive)
}

data class Decorations (val rocks: String) {}
data class DecorationsTwo (val rocks: String, val woods: String, val diver: String) {}