package section9

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    try {
        println("sdse".toInt())

    } catch (e: NumberFormatException) {
        println("The value is not a number")
    } catch (e: Exception) {
        println("Something went wrong")
    } finally {
        println("Finally always runs")
    }
}