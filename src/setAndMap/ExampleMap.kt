package setAndMap

fun main(){
    val cures: Map<String, String> = mapOf("white spots" to "Ich", "red sores" to "hold disease")

    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))

    println(cures.getOrElse("bloating"){ "no cure for this"})

    val inventory: MutableMap<String, Int> = mutableMapOf("fish net" to 1)
    inventory.put("tank", 3)
    inventory.remove("fish net")



}