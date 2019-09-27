package section12

fun countVowels(phrase: String): Int {
    var vowels = 0
    val line = phrase.toLowerCase().trim()
    for (i in line.indices) {
        when (line[i]) {
            'a', 'e', 'i', 'o', 'u' -> vowels++
        }
    }
    println("Vowels: $vowels")
    return vowels
}

fun countConsonants(phrase: String): Int {
    var consonants = 0
    val line = phrase.toLowerCase().trim()
    for (i in line.indices) {
        when (line[i]) {
            in 'a'..'z' -> consonants++
        }
    }
    val vowels = countVowels(phrase)
    consonants -= vowels
    println("Consonants: $consonants")
    return consonants
}
//Section 16
fun countVowelsFilter(string: String) : Int{
    return string.filter { it.toLowerCase() in "aeiou" }.length
}