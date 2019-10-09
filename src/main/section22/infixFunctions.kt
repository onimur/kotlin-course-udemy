package section22

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main() {

    val n1 = 10.isHalfOf(20)
    //infix lets you write like this:
    val n2 = 10 isHalfOf 30

    println("$n1 - $n2")

    val p1 = Person("Murillo")
    p1 isName "Murillo"
}