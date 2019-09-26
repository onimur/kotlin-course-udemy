package section11

fun average(vararg grades: Float) {
    if (grades.isNotEmpty()) {
        var sum = 0f
        for (grade in grades) {
            sum += grade
        }

        println("The average is: ${sum / grades.size}")
    }
}

fun <T> average(vararg values: T ) {
    for (value in values){
        println(value)
    }
}

fun main() {
    average(8f, 10f, 7f, 2f, 3f, 1f)
    average(20, 10f, false, "Yes", 2)
}