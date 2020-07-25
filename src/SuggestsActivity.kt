fun main() {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {



    return when {
        happyAndSunny(mood, weather) -> "go for a walk"
        sadAndCloudy(mood, weather) -> "listen some harmonica blues"
        stonedAndSnowy(mood, weather) -> "play football manager"
        angryAndSnowy(mood, temperature) -> "go to do some exercises"
        else -> "learn a new language"
    }

}

fun happyAndSunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun sadAndCloudy(mood: String, weather: String) = mood == "sad" && weather == "cloudy"

fun stonedAndSnowy(mood: String, weather: String) = mood == "stoned" && weather == "snowy"

fun angryAndSnowy(mood: String, temperature: Int) = mood == "angry" && temperature >= 30


