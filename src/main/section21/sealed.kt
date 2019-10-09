package section21

/**
 * Sealed classes are used for representing restricted class hierarchies,
 * when a value can have one of the types from a limited set, but cannot have
 * any other type. They are, in a sense, an extension of enum classes: the set of values
 * for an enum type is also restricted, but each enum constant exists only as a single instance,
 * whereas a subclass of a sealed class can have multiple instances which can contain state.
 */
sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String, val errorCode: Int) : Result()
}

class Repo {
    fun execute (): Result {
        return Result.Success("Ok")
    }
}

fun main() {
    val r1 = Repo()

    when (r1.execute()) {
        is Result.Success -> {
            println("Success")
        }
        is Result.Error -> {
            println("Error")
        }
    }
}