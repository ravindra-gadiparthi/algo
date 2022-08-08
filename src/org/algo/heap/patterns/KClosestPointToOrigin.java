package org.algo.heap.patterns;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public static void main(String[] args) {
    new KClosestPointToOrigin().solution(
            new int[][]{{1,3},{-2,2}},1
    );
   }

    public void solution(int points[][], int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int distance = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new Pair(distance, i));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int res[][]=new int[k][2];

        int index=0;
        while(pq.size()>0){
            Pair pair = pq.poll();
            System.out.println(pair.key+" "+pair.value);
            res[index][0]=points[pair.value][0];
            res[index][1]=points[pair.value][1];
            index++;
        }
    }

}
