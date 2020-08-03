package spices

import aquarium.delegate

fun main() {

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
    val color: String
}

object YellowColor : SpiceColor {
    override val color = "yellow"
}










