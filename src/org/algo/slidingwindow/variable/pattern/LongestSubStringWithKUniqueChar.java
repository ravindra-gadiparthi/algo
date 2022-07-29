package org.algo.slidingwindow.variable.pattern;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUniqueChar {
    public static void main(String[] args) {
        LongestSubStringWithKUniqueChar solution = new LongestSubStringWithKUniqueChar();
        solution.solution("aabacbebebe",3);
    }

    public int solution(String input, int k){
        int i=0,j=0,max=0;
        Map<Character,Integer> chars = new HashMap<>();

        while(j<input.length()){
            Character currentChar = input.charAt(j);
            if(chars.containsKey(currentChar)){
                chars.put(currentChar,chars.get(currentChar)+1);
            }else{
                chars.put(currentChar,1);
            }

            if(chars.size()<k){
                j++;
            }else if(chars.size() == k){
                max = Math.max(max,j-i+1);
                j++;
            }else {
                while(chars.size()>k){
                    Character firstChar = input.charAt(i);
                    chars.put(firstChar,chars.get(firstChar)-1);
                    if(chars.get(firstChar)==0) {
                        chars.remove(firstChar);
                    }
                    i++;
                }
                j++;
            }

        }
        return max;
    }
}
