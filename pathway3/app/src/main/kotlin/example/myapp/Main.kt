package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
    val aquarium2 = Aquarium(width = 25)
    val aquarium3 = Aquarium(height = 35, length = 110)
    val aquarium4 = Aquarium(width = 25, height = 35, length = 120)
    aquarium2.printSize()
    aquarium3.printSize()
    aquarium4.printSize()
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume=70
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}