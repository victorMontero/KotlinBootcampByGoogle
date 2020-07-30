package Aquarium

fun main (){
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("length: ${myAquarium.length} " +
            "width: ${myAquarium.width} " +
            "height: ${myAquarium.height}")

    myAquarium.height = 100

    println("new height ${myAquarium.height}")
    println("volume: ${myAquarium.volume}")

}
