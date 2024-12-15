fun main() {
    // Variables
    val name: String = "Kavya" // Immutable variable
    var age: Int = 21 // Mutable variable

    // Printing output
    println("Hello, $name! You are $age years old.")

    // Function call
    val sumResult = addNumbers(10, 20)
    println("The sum of 10 and 20 is: $sumResult")

    // If-else condition
    if (age >= 18) {
        println("$name is an adult.")
    } else {
        println("$name is a minor.")
    }

    // When statement (like switch-case)
    val grade = "A"
    when (grade) {
        "A" -> println("Excellent!")
        "B" -> println("Good job!")
        "C" -> println("Needs improvement.")
        else -> println("Invalid grade.")
    }

    // Loop
    println("Counting from 1 to 5:")
    for (i in 1..5) {
        println(i)
    }

    // List and loop
    val fruits = listOf("Apple", "Banana", "Cherry")
    println("Fruits list:")
    for (fruit in fruits) {
        println(fruit)
    }
}

// Function
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}
