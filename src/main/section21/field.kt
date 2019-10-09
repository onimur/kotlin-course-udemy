package section21

class Car(private val maxSpeed: Int) {
    var currentSpeed = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Speed greater than allowed.")
            } else {
                field = value
            }
        }
        get() {
            //business rules
            return (field + maxSpeed) / 2
        }
}

fun main() {
    val c1 = Car(220)
    c1.currentSpeed = 20

    println(c1.currentSpeed)
}