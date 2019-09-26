package section9

/*
Double  64
Float   32
Long    64
Int     32
Short   16
Byte    8
 */

fun main() {

    val n1: Double = Double.MAX_VALUE
    val b1: Byte = n1.toByte()
    val b2: Byte = 100

    println(n1)
    println(b1)

    println(b2.toShort())
    println(b2.toLong())
    println(b2.toFloat())
    println(b2.toDouble())

}