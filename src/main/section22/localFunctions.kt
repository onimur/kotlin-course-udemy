package section22

import java.text.SimpleDateFormat
import java.util.*


fun log(str: String){
    println(str)
}
fun top() {
    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }
    log("Start")
    section22.log("")
    val interval = 1..1000000
    var sum = 0.0
    for (i in interval) {
        sum += 1 * 2 *1
    }

    log("End")
}

fun main() {
    top()
    log("t")



}