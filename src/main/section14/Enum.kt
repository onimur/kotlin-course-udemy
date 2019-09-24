package section14
@Suppress("unused")
enum class Priority {
    //constant
    LOW,
    MED, HIGH
}
@Suppress("unused")
enum class Priority2(val id: Int) {
    LOW(1) {
        override fun toString(): String {
            return "toString now returns LOW"
        }
    },
    MED(2), HIGH(3)
}

class Alarm(var desc: String, var p: Priority2)

fun main() {
    for (p in Priority.values()) {
        if (p.toString() == "MED") {
            print("This is true!\n")
        }
        println(p)
    }

    for (p in Priority2.values()) {
        //ordinal get the position
        println("$p - ${p.id} - ${p.ordinal}")
    }

    val alarm = Alarm("midday", Priority2.HIGH)
    println("${alarm.desc} - ${alarm.p}")
}