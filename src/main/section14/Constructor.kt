package section14

class People(var name: String) {
    var yearOfBirth: Int? = null

    constructor(name: String, yearOfBirth: Int) : this(name) {
        this.yearOfBirth = yearOfBirth

    }

    fun hello() {
        println("Hello, my name is $name")
    }
}

fun main() {


    val people = People("Murillo", 1980)
    println(people.name)
    println(people.yearOfBirth)
    people.hello()

    val people2 = People("Murillo")
    println(people2.name)
    println(people2.yearOfBirth)
    people2.hello()
}