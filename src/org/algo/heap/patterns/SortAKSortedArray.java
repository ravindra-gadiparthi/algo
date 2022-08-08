package org.algo.heap.patterns;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortAKSortedArray {
    public static void main(String[] args) {
    new SortAKSortedArray().sortArray(new int[]{6,5,3,2,8,10,9},3);
    }

    /**
     * Use Min Heap and add elements when heap size exceed K,
     * also left over elements of heap.
     * @param nums
     * @param k
     * @return
     */
    public int[] sortArray(int nums[], int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int res[] = new int[nums.length], index = 0;
        for (int value : nums) {
            priorityQueue.add(value);
            if (priorityQueue.size() > k) {
                res[index++] = priorityQueue.poll();
            }
        }

        while (priorityQueue.size() > 0) {
            res[index++] = priorityQueue.poll();
        }

        System.out.println(Arrays.toString(res));
        return res;
    }
}
