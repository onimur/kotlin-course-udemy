package section14

import section14.model.Computer


fun main() {
    val c = Computer("AMD")
    println("Model: ${c.model} Core: ${c.core} Memory: ${c.ram}")
    c.core = 10
    c.ram = 31
    println("Model: ${c.model} Core: ${c.core} Memory: ${c.ram}")
}