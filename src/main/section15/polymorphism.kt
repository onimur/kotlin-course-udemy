package section15

interface Employee {
    fun bonusCalculate()
}

class Manager : Employee {
    override fun bonusCalculate() {
        println("Bonus: 500")
    }

}

class Technician : Employee {
    override fun bonusCalculate() {
        println("Bonus: 200")

    }
}

class Analyst : Employee {
    override fun bonusCalculate() {

    }

}

fun main() {

    val e1: Employee = Manager()
    val e2: Employee = Technician()

    calculate(e1)
    calculate(e2)
}

fun calculate(employee: Employee) {
    employee.bonusCalculate()
}