package org.algo.heap.basic;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElement {

    static Comparator<Integer> maxPriority = (o1, o2) -> {
        int value = Integer.compare(o1,o2);
        if(value>0){
            return -1;
        }else if(value<0){
            return 1;
        }else {
            return 0;
        }
    };
    public static void main(String[] args) {
        new KthElement().smallElement(new int[]{7,10,4,3,20,15},3);
        new KthElement().largestElement(new int[]{7,10,4,3,20,15},3);
    }

    public int largestElement(int array[],int position){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        return elementAt(array,position,priorityQueue);
    }

    public int smallElement(int array[],int position){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        return elementAt(array,position,priorityQueue);
    }

    public int elementAt(int array[],int position,PriorityQueue<Integer> priorityQueue){
        for(int element:array){
            priorityQueue.add(element);
            if(priorityQueue.size()>position){
                priorityQueue.poll();
            }
        }
        System.out.println(priorityQueue.peek());
        return priorityQueue.poll();
    }
}
