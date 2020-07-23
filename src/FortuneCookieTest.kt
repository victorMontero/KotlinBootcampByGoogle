fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune."
    )
    val index =  when (birthday) {
        28, 31 -> 3
        in 1..7 -> 6
        else -> birthday.rem(fortunes.size)  //.rem() Calculates the remainder of dividing this value by the other value.
    }
    return fortunes[index]
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
// MY SOLUTION
//fun main(args: Array<String>) {
//    println(if(args[0].toInt() <= 12) "Good morning, Kotlin" else "Good night, Kotlin")
//    //dayOfWeek()
//    //feedTheFish()
//    getFourtuneCookie()
//}
//
//fun getFourtuneCookie(): String {
//    val fortuneList = listOf("You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends because they are your greatest fortune.")
//
//    println("enter your birthday")
//
//    val birthday = readLine()?.toIntOrNull() ?:1
//    val message = birthday.rem(fortuneList.size)
//    return println("your fourtune is: ${fortuneList[message]}").toString()
//
//
//}

