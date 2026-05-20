package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    void testCapitalize() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("World", StringUtils.capitalize("WORLD"));
        assertEquals("", StringUtils.capitalize(""));
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    void testReverseNormalString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void testReverseAsciiSymbols() {
        assertEquals("!321cba", StringUtils.reverse("abc123!"));
    }

    @Test
    void testReverseUnicode() {
        String input = "hello мир";
        String expected = new StringBuilder(input).reverse().toString();
        assertEquals(expected, StringUtils.reverse(input));
    }

    @Test
    void testReverseNull() {
        assertNull(StringUtils.reverse(null));
    }
}
