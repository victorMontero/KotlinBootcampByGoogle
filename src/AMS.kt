import java.util.*
import java.util.Random as Random

fun main(args: Array<String>) {
    //println(if(args[0].toInt() <= 12) "Good morning, Kotlin" else "Good night, Kotlin")
    feedTheFish()
    //swim(50, speed = "slow")

}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean{
    return true
}

fun swim (time : Int, speed : String = "fast"){
    println("swimming $speed at $time kph")
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("today is $day and the fish eat $food")

    if (shouldChangeWater(day)){
        println("change the water today")
    }
}

fun randomDay(): String {
    val week = listOf("sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"

    return when(day){
        "sunday" -> "flakes"
        "monday" -> "worms"
        "wednesday" -> "granules"
        "thursday" -> "plankton"
        "friday" -> "worms again"
        else -> "fasting"
    }
}


fun dayOfWeek() {
    //println("what day is today?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (day){
        1 -> println("today is sunday :)")
        2 -> println("today is monday :(")
        3 -> println("today is tuesday :(")
        4 -> println("today is wednesday :|")
        5 -> println("today is thursday :|")
        6 -> println("today is friday :)")
        7 -> println("today is saturday :)")
    }

    val temperature = 10
    val isHot = if (temperature > 50 ) true else false
    //println(isHot)

    val message = "you are ${if (temperature > 50)"fried" else "safe"} fish"
    //println(message)

}