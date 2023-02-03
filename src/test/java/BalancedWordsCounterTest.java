import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    @Test
    void countRepeatBalancedWords() {
        String input = "aabbcbcccbaa";
        Integer result = 4;

        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        Integer count = balancedWordsCounter.count(input);

        assertEquals(result, count);
    }

    @Test
    void countEmptyString() {
        String input = "";
        Integer result = 0;

        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        Integer count = balancedWordsCounter.count(input);

        assertEquals(result, count);
    }

    @Test
    void countOnlyLetter() {
        String input = "abababa1";

        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();


        assertThrows(RuntimeException.class, () ->
                balancedWordsCounter.count(input)
        );
    }

    @Test
    void countIfStringIsNull() {
        String input = null;

        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();


        assertThrows(RuntimeException.class, () ->
                balancedWordsCounter.count(input)
        );
    }

}