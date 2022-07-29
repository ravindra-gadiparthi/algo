package org.algo.slidingwindow.fixed.patterns;

import java.util.HashMap;
import java.util.Map;

public class CountAnagramOccurrences {
  public static void main(String[] args) {
    CountAnagramOccurrences solution = new CountAnagramOccurrences();
    solution.anagrams("forxxorfxaofr","for");
  }

  public int anagrams(String text, String pattern) {
    Map<Character, Integer> letterCount = new HashMap<>();
    for (char c : pattern.toCharArray()) {
      if (letterCount.containsKey(c)) {
        letterCount.put(c, letterCount.get(c) + 1);
      } else {
        letterCount.put(c, 1);
      }
    }
    int count = letterCount.size();
    int i = 0, j = 0;
    int result = 0;
    while (j < text.length()) {
      Character currentChar = text.charAt(j);
      Character firstChar = text.charAt(i);
      if (letterCount.containsKey(currentChar)) {
        letterCount.put(text.charAt(j), letterCount.get(currentChar) - 1);
        if (letterCount.get(currentChar) == 0) {
          count--;
        }
      }
      if (j - i + 1 < pattern.length()) {
        j++;
      } else if (j - i + 1 == pattern.length()) {
        if (count == 0) {
          result++;
        }
        if (letterCount.containsKey(firstChar)) {
          letterCount.put(firstChar, letterCount.get(firstChar) + 1);
          if (letterCount.get(firstChar) == 1) {
            count++;
          }
        }
        i++;
        j++;
      }
    }
    System.out.println("Total number of anagrams " + result);
    return result;
  }
}
