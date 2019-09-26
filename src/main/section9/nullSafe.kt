package section9

fun main() {

    val str: String? = null
    //null safe
    println(str?.length)
    //nullpointerexception
    println(str!!.length)
}