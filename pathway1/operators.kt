fun main() {
  // Variable declaration
  val i: Int = 6

  // Type casting
  val b1 = i.toByte()
  println(b1)

  // Type assignment
  val b2: Byte = 1
  println(b2)

  // Type mismatch
  // val i1: Int = b2
  // error: type mismatch: inferred type is Byte but Int was expected
  // val i2: String = b2
  // error: type mismatch: inferred type is Byte but String was expected
  // val i3: Double = b2
  // error: type mismatch: inferred type is Byte but Double was expected

  // Fixing type mismatch with casts
  val i1: Int = b2.toInt()
  val i2: String = b2.toString()
  val i3: Double = b2.toDouble()
  println(i1)
  println(i2)
  println(i3)

  // Numeric constant readability syntax sugar. 
  // N.b. the compiler infers the type when initial value provided
  val oneMillion = 1_000_000
  val socialSecurityNumber = 999_99_9999L
  val hexBytes = 0xFF_EC_DE_5E
  val bytes = 0b11010010_01101001_10010100_10010010

  // var: mutable variable
  var fish = 1
  fish = 2

  // val: immutable variable
  var aquarium = 1
  // aquarium = 2
  // error: val cannot be reassigned

  // Explicit type declaration. Variable types are immutable (not re-inferred later)
  var fishes: Int = 12
  var lakes: Double = 2.5
  
  // String interpolation and concatenation
  val numberOfFish = 5
  val numberOfPlants = 12
  println("I have ${numberOfFish + numberOfPlants}" + " fish and plants")
}
