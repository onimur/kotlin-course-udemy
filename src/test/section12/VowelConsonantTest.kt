package section12

import org.junit.Assert.assertEquals
import org.junit.Test

class VowelConsonantTest {
    @Test fun countVowels(){
        assertEquals(11, countVowels("Quantas vogais tem esta frase?"))
    }

    @Test fun countConsonants(){
        assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes!"))
    }

    @Test fun countVowelsAndConsonants(){
        val phrase = "Estou gostando muito de aprender Kotlin!"
        assertEquals(15, countVowels(phrase))
        assertEquals(19, countConsonants(phrase))
    }
}