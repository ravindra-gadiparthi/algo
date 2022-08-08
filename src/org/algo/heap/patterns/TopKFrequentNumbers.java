package org.algo.heap.patterns;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentNumbers
{
    public static void main(String[] args) {
        new TopKFrequentNumbers().solution(new int[]{1,1,1,1,3,2,2,4},2);
    }

    public void solution(int nums[],int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Pair> priorityQueue=new PriorityQueue<>();

        for(int key:nums){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }

        for(Integer key:map.keySet()){
            priorityQueue.add(new Pair(map.get(key),key));
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        System.out.println(priorityQueue);
    }
}

