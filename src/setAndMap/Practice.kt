package setAndMap

fun main(){

    val allBooks = setOf("first book", "second book", "third book", "fourth book", "fifth book", "sixth book")
    val library = mapOf("shakespeare" to allBooks)

    println(library.any { it.value.contains("third book") })
    println(library)

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("jungle book"){"kipling"}
    moreBooks.getOrPut("hamlet"){"shakespeare"}

    println(moreBooks)
    println(moreBooks.size)


    
}