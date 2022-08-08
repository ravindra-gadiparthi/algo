package org.algo.heap.patterns;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SumBetweenK1K2Elements
{
    public static void main(String[] args) {
        new SumBetweenK1K2Elements().solution(new int[]{1,3,12,5,15,11},3,6);
    }

    public int solution(int nums[],int k1,int k2){
        int k1E = kThSmallestElement(nums,k1);
        int k2E = kThSmallestElement(nums,k2);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k1E && nums[i]<k2E){
            sum+=nums[i];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public int kThSmallestElement(int nums[],int k){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            priorityQueue.add(nums[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }
}
