package org.algo.dp.slidingwindow.variable.pattern;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutKRepeatingChar {
    public static void main(String[] args) {
        LongestSubStringWithoutKRepeatingChar solution = new LongestSubStringWithoutKRepeatingChar();
            solution.solution("pwweke");
    }


    public int solution(String input){
        int i=0,j=0,max=0;
        Map<Character,Integer> map = new HashMap<>();

        while (j<input.length()){
            char current = input.charAt(j);
            if(map.containsKey(current)){
                map.put(current,map.get(current)+1);
            }else{
                map.put(current,1);
            }

            if(map.size() < (j-i)+1)

            if(map.size() < (j-i+1)){
                while (map.size()<(j-i+1)){
                    char first = input.charAt(i);
                    if(map.get(first)==1){
                        map.remove(first);
                    }else{
                        map.put(first,map.get(first)-1);
                    }
                    i++;
                }
                j++;
            }else if(map.size()==(j-i+1)){
                max = Math.max(max,map.size());
                j++;
            }
        }
        System.out.println(max);
        return max;
    }
    /**
     *
     * @param input
     * @return
     */
    public int solutionOptimized(String input){
        int j=0,i=0,max=0;
        Map<Character,Integer> chars = new HashMap<>();
        while(j<input.length()){
            Character current = input.charAt(j);

            if(!chars.containsKey(current)){
                max = Math.max(max,j-i+1);
            }else{
                while(chars.containsKey(current)){
                    chars.remove(input.charAt(i));
                    i++;
                }
            }
            j++;
            chars.put(current,1);
        }
        System.out.println(max);
        return max;
    }
}
