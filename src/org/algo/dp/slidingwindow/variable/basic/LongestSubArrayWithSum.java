package org.algo.dp.slidingwindow.variable.basic;

import java.util.Arrays;

public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        LongestSubArrayWithSum solution = new LongestSubArrayWithSum();
        solution.solution(new int[]{4,2,1,1,1,1,5},5);
    }

    public int solution(int array[],int sum){
        int i=0,j=0,currentSum=0,max=0;
        while(j<array.length) {
            currentSum += array[j];
            if (currentSum < sum) {
                j++;
            } else if (currentSum == sum) {
                max = Math.max(max, j -i+ 1);
                j++;
            }else{
                while(currentSum>sum) {
                    currentSum = currentSum - array[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(array)+" solution "+max);
        return max;
    }
}
