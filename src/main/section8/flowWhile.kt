package section8

fun main() {

    var index = 0
    while (index < 100){
        println(index)
        index++

        if (index == 20){
            break
        }
    }

    var l = 10
    do {
        println(l)
        l +=5
    } while (l <= 100)

}