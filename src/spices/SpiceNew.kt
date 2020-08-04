package spices

import aquarium.Decorations.Decorations

fun main() {
//    val mySpice = Curry("paprika", "mild")
//    print("${mySpice.name} ${mySpice.color} ${mySpice.spiciness}")

    val spiceCabinet = listOf(SpiceContainer(Curry("red curry", "medium")), SpiceContainer(Curry("green curry", "spicy")))
    for (element in spiceCabinet) println(element.label)
}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice(spice: Spice)

}

class Curry(
    name: String, spiciness: String,
    color: SpiceColor = YellowColor
) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
    }

    override fun prepareSpice(spice: Spice) {
        grind()
    }

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowColor : SpiceColor {
    override val color = Color.YELLOW
}

data class SpiceContainer (val spice: Spice) {
    val label = spice.name
}

enum class Color(val rgb: Int){
    YELLOW(0xFFFF00)
}











