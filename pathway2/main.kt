// args definition not necessary if no paramaters used
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        print("Please add some command line arguments")
        return
    }
    val isUnit = println("Hello, ${args[0]}")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
}
// When a function has no explicit return statement, it returns kotlin.Unit
// "Everything has a value" even if statements and functions (kotlin.Unit being the base). That said "Loops" do not have a value.
