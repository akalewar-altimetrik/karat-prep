import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCompressionTest {

    @Test
    public void testSingleCharacter(){
        assertEquals("a1", StringCompression.stringCompression("a"));
    }

    @Test
    public void testNonRepeatingChars(){
        assertEquals("a1b1c1", StringCompression.stringCompression("abc"));
    }

    @Test
    public void testMixedCharacters() {
        assertEquals("a3b2c1d3v1e1w3", StringCompression.stringCompression("aaabbcdddvewww"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", StringCompression.stringCompression(""));
    }
}
