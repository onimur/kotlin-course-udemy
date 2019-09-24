package section14
//construct
//kotlin already takes care of getter and setters
class Machine (var model: String)

fun main() {
    val m = Machine("Brastemp")
    //get
    println(m.model)
    //set
    m.model = "Eletrolux"
    println(m.model)

}