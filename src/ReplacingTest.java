import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplacingTest {

    @Test
    void shouldReplaceEveryALetter() {
        String sentence = "Vader said: No, I am your father!";
        char oldValue = 'a';
        char newValue = 'o';
        int n = 1;

        String newSentence = Replacer.createNewSentence(sentence, oldValue, newValue, n);

        assertEquals("Voder soid: No, I om your fother!", newSentence);
    }

    @Test
    void shouldReplaceTwoLettersFromTheSentence() {
        String sentence = "Vader said: No, I am your father!";
        char oldValue = 'a';
        char newValue = 'o';
        int n = 2;

        String newSentence = Replacer.createNewSentence(sentence, oldValue, newValue, n);

        assertEquals("Vader soid: No, I am your fother!", newSentence);
    }

    @Test
    void shouldReplaceEveryNumber3To0() {
        String sentence = "123123123123123123123123123123123123123123";
        char oldValue = '3';
        char newValue = '0';
        int n = 3;

        String newSentence = Replacer.createNewSentence(sentence, oldValue, newValue, n);

        assertEquals("123123120123123120123123120123123120123123", newSentence);
    }
}