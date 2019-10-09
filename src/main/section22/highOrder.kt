package section22

fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

fun <T> Iterable<T>.customForEach(op: (T) -> Unit) {
    for (i in this) {
        op(i)
    }
    // more logic
}

fun main() {

    val list = listOf(1, 2, 3, 4)
    list.forEach(::println)
    list.customForEach { println(it) }

    val setList = listOf("a", "b", "c")
    setList.customForEach { println(it) }

    val map = mapOf(Pair("Paris", "France"))
    map.values.customForEach { println(it) }
    println(operator(1, 2, ::sum))
    println(operator(1, 2, ::multiply))
}