package section12

import org.junit.Assert.assertEquals
import org.junit.Test

class VowelConsonantTest {
    @Test
    fun should_countVowels() {
        assertEquals(11, countVowels("How many vowels does this phrase have?"))
    }

    @Test
    fun should_countConsonants() {
        assertEquals(20, countConsonants("Usually a sentence has more consonants!"))
    }

    @Test
    fun should_countVowelsAndConsonants() {
        val phrase = "I'm really enjoying learning Kotlin!"
        assertEquals(11, countVowels(phrase))
        assertEquals(19, countConsonants(phrase))
    }

    @Test
    fun should_countVowelsFilter(){
        assertEquals(5, countVowelsFilter("My phrase with vowels"))
    }
}