package org.algo.heap.patterns;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosetNumbers {
    class MaxHeapPair implements Comparable<MaxHeapPair>{
        private int diff;
        private int res;
        public MaxHeapPair(int diff,int res){
            this.diff=diff;
            this.res=res;
        }

        public int getDiff() {
            return diff;
        }

        public int getRes() {
            return res;
        }

        @Override
        public int compareTo(MaxHeapPair o) {
            int value = Integer.compare(this.getDiff(),o.getDiff());
            if(value==0){
                return Integer.compare(o.getRes(),this.getRes());
            }
            return value;
        }

        @Override
        public String toString() {
            return "MaxHeapPair{" +
                    "res=" + res +
                    "diff=" + diff +
                    '}';
        }
    }
    public static void main(String[] args) {
        //new KClosetNumbers().printKCloseNumbers(new int[]{5,6,7,8,9},7,3);
        new KClosetNumbers().printKCloseNumbers(new int[]{1,2,3,4,5},3,4);
    }

    public void printKCloseNumbers(int nums[],int x, int k){
        PriorityQueue<MaxHeapPair> maxHeapPairs=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxHeapPairs.add(new MaxHeapPair(Math.abs(x-nums[i]),nums[i]));
            while (maxHeapPairs.size()>k){
                maxHeapPairs.poll();
            }
        }

        while (maxHeapPairs.size()>0){
            System.out.println(maxHeapPairs.poll());
        }
    }
}
