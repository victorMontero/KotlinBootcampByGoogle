package aquarium.aquariumExamples

fun main() {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("fish has color: ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus(fishColor: FishColor = GoldColor) :
    FishColor by fishColor,
    FishAction by PrintingFishAction(
        "a lot of algae"
    )


class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

object RedColor : FishColor {
    override val color = "red"
}