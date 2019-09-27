package section15

class People {
    //prevents initialization of a variable as null or empty
    lateinit var name: String

    fun nameGenerator() {
        name = "Roberta"
        name.length
    }
}

fun main() {

    val people = People()
    people.nameGenerator()

}