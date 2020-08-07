package generics

open class WaterSupply (var needsProcessed: Boolean)

class TapWater : WaterSupply(true){

    fun addChemicalsCleaners(){
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true){

    fun filter(){
        needsProcessed = false
    }
}

class  Aquarium<T: WaterSupply>(val waterSupply: T){
    fun addWater(){
        check(!waterSupply.needsProcessed){"water supply needs processed"}

        println("adding water from $waterSupply")
    }
}

fun genericExample(){
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalsCleaners()

    val anotherAquarium = Aquarium(LakeWater())
    anotherAquarium.waterSupply.filter()
    anotherAquarium.addWater()
}

