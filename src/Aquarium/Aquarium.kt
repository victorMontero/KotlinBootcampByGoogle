package Aquarium

class Aquarium{

    var height: Int = 40
    var width: Int = 20
    var length: Int = 100

    var volume: Int
    get() = width * height * length / 100
    set(value){height = (value * 1000 / (width * length))}
}

