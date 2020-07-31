package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        println("first init block")
    }

    init {
        if (friendly) {size = volumeNeeded * 2
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("running second block")
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample(){
    val fish = Fish(friendly = true, volumeNeeded = 20)
    println("is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}