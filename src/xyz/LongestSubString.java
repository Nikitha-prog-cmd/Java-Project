package xyz;

import java.util.HashMap;

public class LongestSubString {
    public static String longestUniqueSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, maxLength = 0, maxStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, move the start pointer
            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }

            // Update the last seen index of the current character
            map.put(currentChar, end);

            // Update maxLength and maxStart if a longer substring is found
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        // Return the longest substring without repeating characters
        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "ABDEFGABEF";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
