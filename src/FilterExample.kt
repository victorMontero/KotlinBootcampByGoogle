fun main(){

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )


    println(spices.sortedWith(compareBy { it.length }))
    println(spices.filter { it[0] == 'c'})
    //println(spices.filter { it ->  })

}