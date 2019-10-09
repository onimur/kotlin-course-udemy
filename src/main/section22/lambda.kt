package section22

private fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

private fun sum(x: Int, y: Int) = x + y

private fun multiply(x: Int, y: Int) = x * y

fun main() {

    operator(1, 2, ::sum)
    operator(1, 2, ::multiply)

    print(operator(10, 20) { x: Int, y -> x + y })

    val l1 = { x: Int, y: Int -> x + y }
    print(operator(2, 5, l1))

    val l2: (Int, Int) -> Int = { x, y -> x + y }
    print(operator(2, 5, l2))
}