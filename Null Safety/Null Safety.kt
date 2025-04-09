fun nullSafetyExample() {
    var nullableString: String? = "Hello, Kotlin!"
    println(nullableString?.length)
    nullableString = null
    println(nullableString?.length ?: "String is null")
}

fun main() {
    variablesExample()
    basicTypes()
    collectionsExample()
    controlFlowExample()
    mainFunctions()
    val person = Person("Alice", 25)
    person.introduce()
    nullSafetyExample()
}