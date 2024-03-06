import org.junit.Test;
import static org.junit.Assert.*;
public class StringManipulatorTest{
    @Test
    public void testReverseString() {
        StringManipulator stringManipulator = new StringManipulator();

        // Test case 1: Regular string
        assertEquals("tac", stringManipulator.reverseString("cat"));

        // Test case 2: Empty string
        assertEquals("", stringManipulator.reverseString(""));

        // Test case 3: Null input
        assertNull(stringManipulator.reverseString(null));
    }
    @Test
    public void testIsPalindrome() {
        StringManipulator stringManipulator = new StringManipulator();

        // Test case 1: Palindrome
        assertTrue(stringManipulator.isPalindrome("radar"));

        // Test case 2: Not a palindrome
        assertFalse(stringManipulator.isPalindrome("hello"));

        // Test case 3: Empty string
        assertTrue(stringManipulator.isPalindrome(""));

        // Test case 4: Null input
        assertTrue(stringManipulator.isPalindrome(null));
    }

    @Test
    public void testFirstNonRepeatedCharacter() {
        StringManipulator stringManipulator = new StringManipulator();

        // Test case 1: Regular string with non-repeated character
        assertEquals('h', stringManipulator.firstNonRepeatedCharacter("hello"));

        // Test case 2: Regular string with all characters repeated
        assertEquals('\0', stringManipulator.firstNonRepeatedCharacter("aabbcc"));

        // Test case 3: Empty string
        assertEquals('\0', stringManipulator.firstNonRepeatedCharacter(""));

        // Test case 4: Null input
        assertEquals('\0', stringManipulator.firstNonRepeatedCharacter(null));
    }
}
