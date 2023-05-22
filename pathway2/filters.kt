fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager filter: creates result list immediately when executed
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    // lazy filter, use Sequence, will wait until asked to evaluate
    val lazy = decorations.asSequence().filter { it[0] == 'p' }
    println("lazy, as a Sequence: $lazy")
    println("lazy, evaluated: ${lazy.toList()}")

    // lazy map
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("----")
    println("lazy map, as a Sequence: $lazyMap")
    println("----")
    println("first: ${lazyMap.first()}")
    println("----")
    println("all: ${lazyMap.toList()}")
    println("----")

    // Note: only the filtered elements are accessed here for the mapping (lazy)
    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("filtered: ${lazyMap2.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities) // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}
