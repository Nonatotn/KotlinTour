fun collectionsExample() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val mutableNumbers = mutableListOf(1, 2, 3)
    mutableNumbers.add(4)
    println("Immutable List: $numbers")
    println("Mutable List: $mutableNumbers")
}