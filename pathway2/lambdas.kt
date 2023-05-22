fun main() {
    var dirtyLevel = 20

    // Basic lambda: use the function arrow ->
    // val waterFilter = { dirty: Int -> dirty / 2 }

    // "Better" lambda: make explicit the parameter/return types
    //    Type: waterFilter can be any function that takes an Int and returns an Int
    //    Assignment: a lambda that takes an Int and returns an Int
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    // Using lambdas in a higher order function, by (1) lambda var (2) defined function (3) last parameter call syntax
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))
    println(updateDirty(19) { level -> level + 23 })
}

// Defining a higher order function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1
