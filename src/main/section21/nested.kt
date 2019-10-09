package section21

class Computer(val processorModel: String) {
    class Memory(val level: Int) {
        fun getMemoryLevel(): Int {
            return 70
        }
    }
}

class Computer2(val processorModel: String) {
    inner class Memory2(val level: Int) {
        fun getMemoryLevel(): Int {
            println(processorModel)
            return 70
        }
    }
}

fun main() {
    val m1 = Computer.Memory(3)
    m1.getMemoryLevel()
    m1.level

    val m2 = Computer2("Intel").Memory2(3)
    m2.getMemoryLevel()
    m2.level

}