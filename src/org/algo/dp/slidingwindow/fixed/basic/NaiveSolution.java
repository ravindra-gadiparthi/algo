package org.algo.dp.slidingwindow.fixed.basic;

public class NaiveSolution {
    public static void main(String[] args) {
    NaiveSolution solution = new NaiveSolution();
    solution.maxSubArray(new int[]{2,3,5,2,9,7,1},3);
    }

    public int maxSubArray(int array[], int size) {
        int max = 0;
        for (int i = 0; i < array.length-size; i++) {
            int currentMax = 0;
            for (int j = i; j < i + 3; j++) {
                currentMax += array[j];
            }
            max = Math.max(currentMax, max);
        }
        System.out.println(max);
        return max;
    }
}
