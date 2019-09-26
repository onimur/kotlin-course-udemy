package section8

fun calculateBonus(office: String, salary: Float): Float {
    //Junior manager, Senior manager, Coordinator
    if (office == "Coordinator") {
        return salary * 0.2f
    } else if (office.contains("Junior")) {
        return salary * 0.5f
    } else {
        return salary * 2
    }
}
////////////////////////////////////////////////////////////////////////////////////
//if - else
fun adult(age: Int) {
    if (age >= 18) {
        println("Adult")
    } else {
        println("Not of legal age")
    }
}

/*
fun adult(age: Int) : Boolean {
   return age >= 18
}
*/
////////////////////////////////////////////////////////////////////////////////////

fun main() {
    adult(10)
    adult(20)
    adult(18)


    println(calculateBonus("Senior manager", 1000f))
    println(calculateBonus("Junior manager", 1000f))
    println(calculateBonus("Coordinator", 1000f))

    val value = 10
    //Java - ternary operator
    //String str = value == 10 ? "Yes" : "No";
    val str = if (value == 10) "Yes" else "No"
}