package org.algo.heap.patterns;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        //new FrequencySort().solution(new int[]{1,1,1,3,2,2,4});
        new FrequencySort().sortByComparator(new int[]{1,1,1,3,2,2,4});
    }

    public int[] sortByComparator(int nums[]){
        Map<Integer,Integer> freqMap = new HashMap<>();
        int res[]=new int[nums.length];
        for(int key:nums){
            freqMap.put(key,freqMap.getOrDefault(key,0)+1);
        }

        List<Map.Entry<Integer,Integer>> entries= new ArrayList<>(freqMap.entrySet());
        Comparator<Map.Entry<Integer,Integer>> freqComp= (o1, o2) -> {
           if(o1.getValue()==o2.getValue()){
               return Integer.compare(o1.getKey(),o2.getKey());
           }else{
               return Integer.compare(o2.getValue(),o1.getValue());
           }
        };


        Collections.sort(entries,freqComp);
        Iterator<Map.Entry<Integer,Integer>> iterator=entries.iterator();
        int index=0;
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry=iterator.next();
            int freq = entry.getValue();
            while (freq>0){
                res[index++]=entry.getKey();
                freq--;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;

    }
    public int[] solution(int nums[]){
        Map<Integer,Integer> map = new HashMap<>();
        int res[]=new int[nums.length];
        PriorityQueue<Pair> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
        for(int key:nums){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }

        int index=0;
        for(Integer key:map.keySet()){
            priorityQueue.add(new Pair(map.get(key),key));
        }

        while (priorityQueue.size()>0){
            Pair pair=priorityQueue.poll();
            int freq = pair.key;
            while (freq>0){
                res[index++]=pair.value;
                freq--;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
