package section15

//Must use "open" to be inherited
private open class Machine2(private val mark: String) {
    //Must use "open" for method to override
    open fun myMark() {
        println("My mark is $mark")
    }
}

private class Computer2(mark: String, val core: Int) : Machine2(mark) {

    //override
    override fun myMark() {
        println("core: $core")
        super.myMark()
    }

    fun turnOn() {}
    fun process() {}

    //Overload
    fun overload(i: Int) = println("Overload $i")

    fun overload(i: String) = println("Overload $i")
    fun overload(i: Int, s: String) = println("Overload $i, $s")
}

fun main() {
    val c: Computer2 = Computer2("xpto", 10)
    with(c) {
        turnOn()
        process()
        myMark()

        overload(2)
        overload("Hello")
        overload(23, "Hello World")
    }
}