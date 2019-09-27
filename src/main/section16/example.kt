package section16

data class Recipe(val name: String, val calories: Int, val Ingredients: List<Ingredients> = listOf())
data class Ingredients(val name: String, val amount: Int)

fun hasIngredient(list: List<Ingredients>, name: String): Boolean {
   return list.filter { it.name == name }.any()
}

fun main() {

    // Create data list
    val data = listOf(
        Recipe(
            "Lasagna", 1200,
            listOf(
                Ingredients("Flour", 1),
                Ingredients("Ham", 5),
                Ingredients("Cheese", 10),
                Ingredients("Tomato sauce", 2),
                Ingredients("Basil", 3)
            )
        ),
        Recipe("Pancake", 500),
        Recipe("Omelet", 200),
        Recipe("Parmigiana", 700),
        Recipe("Bean soup", 300),
        Recipe(
            "Hamburger", 2000,
            listOf(
                Ingredients("Bread", 1),
                Ingredients("Hamburger", 3),
                Ingredients("Cheese", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Lettuce", 1),
                Ingredients("Tomato", 1)
            )
        )
    )

    // Do I have recipes on the list?
    println("I have recipes? ${if (data.any()) "yes" else "no"}.")  //yes

    // How many recipes do I have in the collection?
    println("I have ${data.count()} recipes.")  //6

    // Got a Lasagna recipe?
    println("Got a Lasagna recipe? ${if (data.any { it.name.contains("Lasagna") }) "yes" else "no"}.")  //yes

    // How many Lasagna recipes?
    println("I have ${data.count { it.name.contains("Lasagna") }} lasagna recipes.")    //1

    // What is the first and last recipe?
    println("The first recipe is: ${data.first().name}.")   //Lasagna
    println("The last recipe is: ${data.last().name}.")     //Hamburger

    // What is the sum of calories?
    val sumCalories = data.sumBy { it.calories }
    println("The sum of calories is: $sumCalories")     //4900

    // Give me the first two recipes
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.name}")     //1 - Lasagna \n 2 - Pancake
    }

    // Know how to make pancake? And sushi?
    val knowPancake = data.filter { it.name == "Pancake" }.any()
    println("Can I make pancakes? ${if (knowPancake) "yes" else "no"}")     //yes

    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Can I make sushi? ${if (knowSushi) "yes" else "no"}")      //no

    //What are foods with more than 500 calories?
    data.filter { it.calories > 500 }.forEach { println(it.name) }      //Lasagna \n Parmigiana \n Hamburger

    // What are foods with more than 500 calories?
    val moreCal = data.maxBy { it.calories }
    println("More calories: ${moreCal?.name}")      //Hamburger

    val lessCal = data.minBy { it.calories }
    println("Less caloric: ${lessCal?.name}")       //Omelet

    // Make a list with the name of the dishes
    data.map { it.name }

    // What is the average heat of all recipes?
    val average = data.map { it.calories }.average()
    println("Average calories is: $average.")       //816.6666

    //What recipes have flour as an ingredient?
    data.filter { hasIngredient(it.Ingredients, "Flour") }
        .forEach { println("The recipe containing flour is: ${it.name}") } //Lasagna

    // Simple data list
    val listIntegers = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Distinct list: ${listIntegers.distinct()}.")       //[1, 2, 6, 67, 7, 3, 34, 56, 5]
    println("Maximum: ${listIntegers.max()}.")                  //67
    println("Minimum: ${listIntegers.min()}.")                  //1

    // Delete recipes of the same name
    println(data.distinctBy { it.name })        //[Recipe(name=Lasagna, calories=1200, Ingredients=[Ingredients(name=Flour, amount=1), Ingredients(name=Ham, amount=5), Ingredients(name=Cheese, amount=10), Ingredients(name=Tomato sauce, amount=2), Ingredients(name=Basil, amount=3)]), Recipe(name=Pancake, calories=500, Ingredients=[]), Recipe(name=Omelet, calories=200, Ingredients=[]), Recipe(name=Parmigiana, calories=700, Ingredients=[]), Recipe(name=Bean soup, calories=300, Ingredients=[]), Recipe(name=Hamburger, calories=2000, Ingredients=[Ingredients(name=Bread, amount=1), Ingredients(name=Hamburger, amount=3), Ingredients(name=Cheese, amount=1), Ingredients(name=Catupiry, amount=1), Ingredients(name=Bacon, amount=3), Ingredients(name=Lettuce, amount=1), Ingredients(name=Tomato, amount=1)])]


    // Sort a list
    listIntegers.sorted()
    listIntegers.sortedDescending()

    // Invert a list
    listIntegers.reversed()

}