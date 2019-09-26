package section8

fun main () {

    //Operator Elvis ?:
    var test: Int? = null
    //if null, use 100
    var op: Int = test ?: 100
    println(op)

    test = 10
    op = test ?: 100
    println(op)

}