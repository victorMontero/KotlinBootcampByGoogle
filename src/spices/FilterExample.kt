package spices

fun main(){

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )


    println(spices.filter { it.contains("curry") }.sortedBy { it.length })  // right solution (the exercise asks to do what I've done but just with curries)

    println(spices.filter { it.startsWith('c') && it.endsWith('e')})

    println(spices.take(3).filter { it.startsWith('c') })

    println(spices.sortedWith(compareBy { it.length })) // this works but it wasn't the idea of the exercise

    val it: ListIterator<String> = spices.listIterator() // this works but it wasn't the idea of the exercise
    while (it.hasNext()){
        val e = it.next()
        print("$e ,")
    }

    val mySpice = SimpleSpice()
    println("")
    println("${mySpice.nameSpice}, ${mySpice.heat}")

    val spiceList = listOf(Spice("pepper", "mild"),
        Spice("jalapeño", "spice"),
        Spice("paprika", "not spice"),
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val newList = spiceList.filter { it.heat < 5 }

}

