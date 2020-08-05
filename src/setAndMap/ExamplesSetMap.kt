package setAndMap

fun main(){
    //val testList = listOf(11,12,13,14,15,16,17,18,19,20)
    //println(testList.reversed())

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    println(symptoms)
    symptoms.remove("white fungus")
    println(symptoms)

    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))

    println(symptoms.subList(3,4))
    println(symptoms.subList(3,symptoms.size))


}

fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size-1 downTo 0){
        result.add(list[i])
    }
    return result
}
