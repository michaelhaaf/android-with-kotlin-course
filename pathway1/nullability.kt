fun main() {
    // var rocks: Int = null
    // error: null can not be a value of a non-null type Int

    // Nullable variable with ?
    var marbles: Int? = null

    // Java-ish-style null check
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        println(fishFoodTreats)
    }

    // Kotlin-style null check with ? [NOTE: bootcamp instructions are bugged. THe ? operator requires nullable types, cannot be inferred implicitly]
    var plantFoodTreats: Int? = 5
    println(plantFoodTreats)
    plantFoodTreats = plantFoodTreats?.dec()
    println(plantFoodTreats)

    // Chaining null tests with the "Elvis operator" ?:
    // E.g. if plantFoodTreats is not null, decrement and use it; otherwise use the value after ?: which is 0
    plantFoodTreats = plantFoodTreats?.dec() ?: 0
    println(plantFoodTreats)

    plantFoodTreats = null
    plantFoodTreats = plantFoodTreats?.dec() ?: 0
    println(plantFoodTreats)

    // Keeping NullPointerExceptions with !! (not-null assertion operator)
    // val len = s!!.length // throws NullPointerException if s is null
}
