package main.java.de.msg.recruitmenttest;
import java.util.*;
public class StringManipulator {

    // Task 1.1
    // Write a method that reverses a given string.
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Task 1.2
    // Write a method that checks if a given string is a palindrome.
    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Task 1.3
    // Write a method that finds the first non-repeated character in a given string.
    public char firstNonRepeatedCharacter(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : input.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }
}
