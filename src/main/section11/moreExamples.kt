package section11

fun main() {

    val str = "lorem ipsum"
    //first char to Uppercase
    println(str.capitalize()) //Lorem ipsum
    //first char to LowerCase
    println(str.decapitalize()) //lorem ipsum
    //if contains the word
    println(str.contains("ipsum")) //true
    println(str.startsWith("l")) //true
    println(str.startsWith("L")) //false
    println(str.startsWith("L", true)) //true

    arrayOf(2, 3, 4, 5, 7)
}