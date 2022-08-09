package org.algo.stack.patterns;

import java.util.Arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        new RainWaterTrapping().solution(new int[]{3, 0, 0, 2, 0, 4});
    }

    public int solution(int buildings[]) {
        int maxLeft[] = new int[buildings.length];
        int maxRight[] = new int[buildings.length];
        maxLeft[0] = buildings[0];
        maxRight[buildings.length - 1] = buildings[buildings.length - 1];
        for (int i = 1, j = buildings.length - 2; i < buildings.length; i++, j--) {
            maxLeft[i] = Math.max(maxLeft[i - 1], buildings[i]);
            maxRight[j] = Math.max(maxRight[j + 1], buildings[j]);
        }
        System.out.println(Arrays.toString(maxLeft));
        System.out.println(Arrays.toString(maxRight));
        int sumOfWater = 0;
        for (int i = 0; i < buildings.length; i++) {
            int minHeight = Math.min(maxLeft[i], maxRight[i]);
            sumOfWater += minHeight - buildings[i];
        }
        System.out.println(sumOfWater);
        return sumOfWater;
    }
}
