fun main() {
    // Lists are a "fundamental type" in Kotlin, and are "similar" to lists in other languages
    // Create them using listOf()
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    // Lists are immutable by default, you cannot add/remove elements after declaration
    // println("Removed an element successfully? ${school.remove("halibut")}") gives exceptions

    // Mutable lists with mutableListOf
    // N.b. val means WHICH list the variable refers to is IMMUTABLE, but the contents can be mutated
    val myList = mutableListOf("tuna", "salme", "sharl")
    println(myList)
    println("Removed the element successfully? ${myList.remove("sharl")}")
    println(myList)
    println("Removed the same element again successfully? ${myList.remove("sharl")}")

    // Create arrays. Unlike lists, there is no "mutable" array (fixed size).
    val group = arrayOf("fish", "mammal", "minnow")
    println(group) // the instructions to use java.util.Arrays for toString don't work on kotlinc-native.

    // You can mix types in Kotlin arrays!
    val mix = arrayOf("fish", 2)
    println(mix)

    // You can have explicity types in Kotlin arrays
    val numbers = intArrayOf(1, 2, 3)

    // Combine two arrays using +
    val combinedArray = intArrayOf(4, 5, 6) + numbers
    println(combinedArray)
    println(combinedArray[2])

    // Different combos of nested arrays and lists
    val oceans = listOf("atlantic", "pacific")
    val oddlist = listOf(numbers, oceans, "salmon")
    println(oddlist)

    // Initialize array with code instead of 0
    val array = Array(5) { it * 2 }
    println("${array[0]}, ${array[1]}, ${array[2]}, ${array[3]}, ${array[4]}\n")

    // LOOPS
    for (element in school)
        print(element + " ")

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 1) print(i)
    println()
    for (i in 3..6 step 2) print(i)
    println()
    for (i in 'd'..'g') print(i)
    println()

    // while and do-while
    var bubbles = 0
    while (bubbles < 40) {
        bubbles++
    }
    println("$bubbles bubbles in the water \n")

    do {
        bubbles--
    } while (bubbles > 30)
    println("$bubbles bubbles in the water")

    repeat(2) {
        println("A fish is swimming")
    }
}
