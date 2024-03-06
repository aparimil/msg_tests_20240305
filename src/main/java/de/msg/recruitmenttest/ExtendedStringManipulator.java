package main.java.de.msg.recruitmenttest;

import java.util.*;

public class ExtendedStringManipulator extends StringManipulator {

    // Task 1.2.1
    // Write a method that concatenates two strings and removes any duplicate characters.
    public String concatenateAndRemoveDuplicates(String str1, String str2) {
        String concatenatedString = str1 + str2;
        Set<Character> uniqueCharacters = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : concatenatedString.toCharArray()) {
            if (uniqueCharacters.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Task 1.2.2
    // Write a method that finds all occurrences of a substring in a given string.
    // Return the indices where the substring starts.
    public List<Integer> findAllSubstringOccurrences(String input, String substring) {
        List<Integer> occurrences = new ArrayList<>();
        if (input == null || substring == null || substring.isEmpty()) {
            return occurrences;
        }

        int index = input.indexOf(substring);
        while (index != -1) {
            occurrences.add(index);
            index = input.indexOf(substring, index + 1);
        }
        return occurrences;
    }
}
