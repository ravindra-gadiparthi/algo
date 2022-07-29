package org.algo.slidingwindow.variable.pattern;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {
    /**
     * "ADOBECODEBANC"
     * "ABC"
     * @param args
     */
    public static void main(String[] args) {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        System.out.println(minWindowSubString.solution("TOTMTAPXYZ","TAT"));
        System.out.println(minWindowSubString.solution("TOTMTAPTTA","TAT"));
    }

    /**
     * Follows variable template, can be improved
     * @param s
     * @param t
     * @return
     */
    public String solution(String s,String t){
        Map<Character,Integer> chars =new HashMap<>();
        for(char c:t.toCharArray()){
            if(chars.containsKey(c)){
                chars.put(c,chars.get(c)+1);
            }else{
                chars.put(c,1);
            }
        }

        int i=0,j=0,min=Integer.MAX_VALUE,count=chars.size();
        String result=null;
        while (j<s.length()){
            Character currentChar = s.charAt(j);
            if(!chars.containsKey(currentChar))
            {
                j++;
            }
            else if(chars.containsKey(currentChar)){
                chars.put(currentChar,chars.get(currentChar)-1);
                if(chars.get(currentChar)==0){
                    count--;
                }
                if(count == 0) {
                    while (count == 0) {
                        if (min > j - i + 1) {
                            min = j - i + 1;
                            result = s.substring(i, j + 1);
                        }
                        if (chars.containsKey(s.charAt(i))) {
                            chars.put(s.charAt(i), chars.get(s.charAt(i)) + 1);
                            if (chars.get(s.charAt(i)) > 0) {
                                count++;
                            }
                        }
                        i++;
                    }
                }
                j++;
            }
        }
        return result;
    }

    public String solutionOptimized(String s,String t){
        Map<Character,Integer> chars =new HashMap<>();
        for(char c:t.toCharArray()){
            if(chars.containsKey(c)){
                chars.put(c,chars.get(c)+1);
            }else{
                chars.put(c,1);
            }
        }
        int i=0,j=0,min=Integer.MAX_VALUE,count=chars.size();
        String result=null;
        while (j<s.length()){
            Character currentChar = s.charAt(j);
            if(chars.containsKey(currentChar)){
                chars.put(currentChar,chars.get(currentChar)-1);
                if(chars.get(currentChar)==0){
                    count--;
                }
                while (count == 0) {
                    if (min > j - i + 1) {
                        min = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                    if (chars.containsKey(s.charAt(i))) {
                        chars.put(s.charAt(i), chars.get(s.charAt(i)) + 1);
                        if (chars.get(s.charAt(i)) > 0) {
                            count++;
                        }
                    }
                    i++;
                }
            }
            j++;
        }
        return result;
    }
}
