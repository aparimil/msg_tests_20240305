package main.java.de.msg.recruitmenttest;
import java.util.*;

public class AdvanceStringManipulator {

    // Task 1.1.1
    // Write a method that returns the count of words in a given sentence.
    public int countWords(String sentence) {
       if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    // Task 1.1.2
    // Write a method that removes duplicate words from a sentence.
    // The order of words should be maintained.
    public String removeDuplicateWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        String[] words = sentence.split("\\s+");
        LinkedHashSet<String> uniqueWordsSet = new LinkedHashSet<>(Arrays.asList(words));
        StringJoiner result = new StringJoiner(" ");
        uniqueWordsSet.forEach(result::add);

        return result.toString();
    }

    // Task 1.1.3
    // Write a method that finds the longest word in a sentence.
    public String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        String[] words = sentence.split("\\s+");
        return Arrays.stream(words)
                .max((s1,s2)->Integer.compare(s1.length(),s2.length()))
                .orElse("");
    }
}
