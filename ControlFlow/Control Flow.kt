fun controlFlowExample() {
    val number = 10
    if (number > 5) {
        println("Number is greater than 5")
    } else {
        println("Number is 5 or less")
    }

    for (i in 1..5) {
        println("Iteration: $i")
    }
}