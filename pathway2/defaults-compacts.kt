fun main(args: Array<String>) {
    swim()
    swim("slow")
    swim(speed = "turtle-like")
    feedTheFish()
}

// Demoing defaults and using them
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

// Same here. Required parameters should be listed first
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    // when expression without argument: a series of if/else if checks
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

// Reusing previous exercise code but also inserting the new stuff.
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
    println("Change water: ${shouldChangeWaterCompacts(day)}")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[(0..6).random()]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

// Compacts (single line expressions don't require curly braces, can be evaluated like this)
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWaterCompacts(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
