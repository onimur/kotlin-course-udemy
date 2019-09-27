package section15

interface Automobile {
    fun turnOn()

    fun turnOff() {
        println("Off")
    }
}

class Car : Automobile {
    override fun turnOn() {

    }

}

interface Interface1 {
    fun hello() {
        println("interface 1")
    }
}

interface Interface2 {
    fun hello() {
        println("interface 2")
    }
}

class ImplementationInterface : Interface1, Interface2 {
    override fun hello() {
        super<Interface1>.hello()
    }

}

fun main() {

}