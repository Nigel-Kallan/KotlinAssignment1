// Adds all integers from 1 up to the specified maximum
fun sumUpTo(max: Int): Int {
    var sum = 0

    for (number in 1..max) {
        sum += number
    }

    return sum
}

// Finds the factorial of a number using a loop
fun factorialIterative(number: Int): Long {
    var result = 1L

    for (i in 1..number) {
        result *= i
    }

    return result
}

// Finds the factorial of a number using a lambda expression
val factorialLambda: (Int) -> Long = { number ->
    var result = 1L

    for (i in 1..number) {
        result *= i
    }

    result
}

// Finds the factorial of a number using recursion
fun factorialRecursive(number: Int): Long {
    return if (number <= 1) {
        1L
    } else {
        number * factorialRecursive(number - 1)
    }
}

fun main() {
    val maximum = 10

    println("Sum from 1 to $maximum = ${sumUpTo(maximum)}")

    val number = 5

    println("Factorial of $number = ${factorialIterative(number)}")

    println("Factorial using lambda of $number = ${factorialLambda(number)}")

    println("Factorial using recursion of $number = ${factorialRecursive(number)}")
}