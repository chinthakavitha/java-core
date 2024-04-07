package com.learningcore.day2session1.string.ps5;

import java.util.ArrayList;
import java.util.List;

public class D02P05p7 {
    public static void main(String[] args) {
        String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};
        String pattern = "abb";

        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);
        for (String word : matchingStrings) {
            System.out.println(word);
        }
    }

    public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> matchingStrings = new ArrayList<>();

        for (String word : dictionary) {
            if (matchesPattern(word, pattern)) {
                matchingStrings.add(word);
            }
        }

        return matchingStrings;
    }

    public static boolean matchesPattern(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            if (pattern.charAt(i) != word.charAt(i) && pattern.charAt(i) != ' ') {
                return false;
            }
        }

        return true;
    }
}
