package section15

//Must use "open" to be inherited
open class Machine(private val mark: String) {
    fun myMark() {
        println("My mark is $mark")
    }
}

class Computer(mark: String, val core: Int) : Machine(mark) {
    fun turnOn() {}
    fun process() {}
}

fun main() {
    val c: Computer = Computer("xpto", 10)
    with(c) {
        turnOn()
        process()
        myMark()
    }
}