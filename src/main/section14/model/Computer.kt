package section14.model

class Computer(var model: String) {
    var ram: Int = 0
    var core: Int = 0
        //methods are incremented if you need to implement more getter and setters
        get() {
            println("Call get")
            return field
        }
        set(value) {
            println("Call set")
            field = value
        }

    fun turnOn() {
        println("turnOn")
    }

    fun process() {
        println("process")
    }

    fun turnOff() {
        println("turnOff")
    }
}