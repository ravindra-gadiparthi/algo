package org.algo.heap.patterns;

import java.util.PriorityQueue;

public class ConnectRopesMinimiseCost {
    public static void main(String[] args) {
        System.out.println(new ConnectRopesMinimiseCost().minCost(new long[]{1,2,3,4,5}));
    }

    long minCost(long ropes[])
    {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long rope:ropes){
            pq.add(rope);
        }
        long cost=0;
        while (pq.size()>1){
            long currentCost = pq.poll() + pq.poll();
            cost+=currentCost;
            pq.add(currentCost);
        }
        return cost;
    }
}
