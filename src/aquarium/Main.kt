package aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println(
        "length: ${myAquarium.length} " +
                "width: ${myAquarium.width} " +
                "height: ${myAquarium.height}"
    )

    myAquarium.height = 100

    println("new height ${myAquarium.height}")
    println("volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("small aquarium: ${smallAquarium.volume}  liters")

    val myAquariumTwo = Aquarium(numberOfFish = 9)
    println(
        "#2 aquarium: ${myAquariumTwo.volume} volume, " +
                "${myAquariumTwo.length} length," +
                "${myAquariumTwo.width} width," +
                "${myAquariumTwo.height} height,"
    )

    fishExample()

}
