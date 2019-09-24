package section14

class Square (val area: Float)
//data - data transition
data class Triangle(val area: Float)

fun main() {
    val s1 = Square(10f)
    val s2 = Square(10f)

    val t1 = Triangle(10f)
    val t2 = Triangle(10f)

    //Override methods - toString
    println(s1) //section14.Square@12a3a380
    println(t1) //Triangle(area=10.0)

    //Override methods - equals
    //compare memory address
    println(s1 == s2) //false
    //with data class the comparison with equals is of value
    println(t1 == t2) //true

    //Override methods - hashcode
    //create hashcode
    println(s1.hashCode()) //312714112
    println(s2.hashCode()) //644117698

    //create hashcode according to values within class
    println(t1.hashCode()) //1092616192
    println(t2.hashCode()) //1092616192

    //copy
    //this method is only in class data
    val t3 = t2.copy()
    println(t3)

}