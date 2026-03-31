import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrequencyBasedSortingTest {

    @Test
    public void testNormalCase(){
        assertEquals("cccaabb",FrequencyBasedSorting.frequencyBasedSorting("aabbccc"));
    }

    @Test
    public void testAllSameCharacters() {
        assertEquals("aaaa", FrequencyBasedSorting.frequencyBasedSorting("aaaa"));
    }

    @Test
    public void testNoRepeatingCharacters() {
        String input = "abc";
        String result = FrequencyBasedSorting.frequencyBasedSorting(input);
        assertEquals(3, result.length());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

}
