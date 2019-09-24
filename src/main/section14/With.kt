package section14

import section14.model.Computer

fun main() {
    val c = Computer("AMD")

    c.turnOn()
    c.process()
    c.turnOff()

    with(c){
        core = 20
        turnOn()
        process()
        turnOff()
    }
}