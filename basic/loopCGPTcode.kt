fun main() {
    // Iterating through a range
    for (i in 1..5) {
        println("Count: $i")
    }

    // Iterating through a list
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    // Using indices
    for (index in fruits.indices) {
        println("Index $index: ${fruits[index]}")
    }
}
