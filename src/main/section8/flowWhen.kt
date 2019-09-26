package section8

fun operation(a: Int, b: Int, c: String): Int {

    return when (c) {
        "sum" -> a + b
        "subtraction" -> a - b
        else -> 0
    }

/*    when (c) {
        "sum" -> {
            return a + b
        }
        "subtraction" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }
    */
}

fun century(a: Int, b: Int) {
    when {
        a > 0 && b > 0 -> {
            println("Variables greater than zero")
        }
        else -> println("Variables less than zero")
    }
    //Range of values
    when (a) {
        in 1..99 -> {
            println("century $a")
        }
        else -> println("Century does not exist")
    }
}

fun main() {
    println(operation(10, 10, "sum"))
    println(operation(20, 10, "subtraction"))
    println(operation(10, 10, "divide"))

    century(10, 10)
    century(0, -1)
}