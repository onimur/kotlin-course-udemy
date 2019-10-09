package section22


data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        return if (denominator == add.denominator) {
            Fraction(numerator + add.numerator, denominator)
        } else {
            val common = denominator * add.denominator
            Fraction(((common / denominator) * numerator) + ((common / add.denominator) * add.numerator), common)
        }
    }

    operator fun inc(): Fraction {
        return this
    }
}

fun main() {
    var n1 = 10
    //
    println(n1.plus(1))
    n1 += 1
    println(n1)
    //
    println(n1.times(10))
    n1 *= 10
    println(n1)
    ///////////////////////////

    var f1 = Fraction(3, 2)
    val f2 = Fraction(5, 3)
    //plus
    println(f1 + f2)
    //inc
    println(f1++)
}