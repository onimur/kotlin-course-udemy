package section8

fun main() {

    val str = "Murillo Comino"
    for (s in str) {
        println("$s ")
    }

    for (i in 0..20){
        println(i)
    }

    for (i in 0..20 step 5){
        println(i)
    }

    for (i in 20 downTo 0){
        println(i)
    }
}