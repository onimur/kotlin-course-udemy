package section16

/**
  * Lists
  *
  * Lists can be changeable or unchanging.
  * Changeable lists
  * Once created, it is not possible to add or remove values, only get.
  *
  * Immutable lists
  * Once created, can be changed to add, remove or update values.
  */
fun main(args: Array<String>) {
    //List - Array, Set, Hashmap
    ///////////////////////////////////////////////////////////////////////////////
    val l1 = listOf("Madrid", "São Paulo", "Berlin")
    //allows adding or removing items
    val l2 = mutableListOf("Madrid", "São Paulo", "Berlin")
    ///////////////////////////////////////////////////////////////////////////////
    val a1 = arrayListOf("Madrid", "São Paulo", "Berlin")
    ///////////////////////////////////////////////////////////////////////////////
    val s1 = setOf("Madrid", "São Paulo", "Berlin", "Berlin")
    println(s1.size)    // 3 elements
    //allows adding or removing items
    val s2 = mutableSetOf("Madrid", "São Paulo", "Berlin", "Berlin")
    s2.add("Berlin")
    println(s2.size)    //3
    ///////////////////////////////////////////////////////////////////////////////
    val h1 = hashMapOf(Pair("key", "value"), Pair("France", "Paris"), Pair("Brazil", "Brasilia"))
    println(h1.entries)     //[France=Paris, Brazil=Brasilia, key=value]
    println(h1["France"])   //Paris
    ///////////////////////////////////////////////////////////////////////////////
    val m1 = mapOf(Pair("key", "value"), Pair("France", "Paris"), Pair("Brazil", "Brasilia"))
    //allows adding or removing items
    val m2 = mutableMapOf(Pair("key", "value"), Pair("France", "Paris"), Pair("Brazil", "Brasilia"))

}