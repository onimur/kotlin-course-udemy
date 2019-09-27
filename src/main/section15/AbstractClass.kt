package section15

abstract class Mammals(private var name: String) {

    var weight: Float = 0f
    abstract fun talk()
    fun sleep() {
        println("$name: I am sleeping \n Weight: $weight")
    }
}

class Dog(name: String) : Mammals(name) {
    //init is executed when a class is instantiated
    init {
        weight = 100f
    }

    override fun talk() {
        println("au au")
    }
}

class Cat(name: String, weight: Float) : Mammals(name) {
    init {
        this.weight = weight
    }

    override fun talk() {
        println("miau")
    }
}

class Cow(name: String) : Mammals(name) {

    override fun talk() {
        println("muuuu")
    }
}

fun main() {
    val dog = Dog("Bolt")
    with(dog) {
        talk()
        sleep()
    }

    val cat = Cat("Stevie", 0.33f)
    with(cat) {
        talk()
        sleep()
    }

    val cow = Cow("Mumu")
    with(cow) {
        talk()
        sleep()
    }
}