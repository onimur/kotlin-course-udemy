package section15

//"private constructor" prevents the class from being instantiated
class Constants private constructor() {
    //the name is not necessary
    companion object BANK {
        val TABLE = "People"

        fun test() {
            println("I am a static method")
        }
    }

    //the name is necessary
    object STORE {
        val TABLE = "Sellers"

        object COLUMNS {
            val ID = "id"
            val TOTAL = "total"
        }
    }

}

fun main() {
    println(Constants.BANK.TABLE)
    Constants.test()

    println(Constants.STORE.TABLE)
    println(Constants.STORE.COLUMNS.ID)
    println(Constants.STORE.COLUMNS.TOTAL)


}