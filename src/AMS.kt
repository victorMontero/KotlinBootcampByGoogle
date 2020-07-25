import java.util.*

fun main(args: Array<String>) {
    //println(if(args[0].toInt() <= 12) "Good morning, Kotlin" else "Good night, Kotlin")
    //feedTheFish()
    //swim(50, speed = "slow")
//    println(canAddFish(10, listOf(3,3,3)))
//    println(canAddFish(8, listOf(2,2,2), hasDecorations = false))
//    println(canAddFish(9, listOf(1,3,3),3))
//    println(canAddFish(10, listOf(), 7, true))
//    println(canAddFish(50, listOf(7,8,9,5,4,10), 5, true))

}

fun canAddFish(
    tankSize: Int,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {


    val realTankSize = if (hasDecorations == true) tankSize * 80 / 100 else tankSize
    val sumFishes = if (currentFish.isEmpty()) currentFish+1 else currentFish

    return if (sumFishes.sum() >= realTankSize) {
        false
    } else if (currentFish.sum() == 0 && fishSize <= realTankSize){
        true
    }else fishSize <= realTankSize.rem(sumFishes.sum())
}


fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
//    val isTooHot = temperature > 30
//    val isDirty = dirty > 30
//    val isSunday = day == "Sunday"

    return when{
        isTooHot(temperature)-> true
        isDirty(dirty)-> true
        isSunday(day)-> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed at $time kph")
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("today is $day and the fish eat $food")

    if (shouldChangeWater(day)) {
        println("change the water today")
    }
}

fun randomDay(): String {
    val week = listOf("sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"

    return when (day) {
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

    when (day) {
        1 -> println("today is sunday :)")
        2 -> println("today is monday :(")
        3 -> println("today is tuesday :(")
        4 -> println("today is wednesday :|")
        5 -> println("today is thursday :|")
        6 -> println("today is friday :)")
        7 -> println("today is saturday :)")
    }

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    //println(isHot)

    val message = "you are ${if (temperature > 50) "fried" else "safe"} fish"
    //println(message)

}