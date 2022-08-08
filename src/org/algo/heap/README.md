Heap Patterns

Max Heap

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20201106115254/MaxHeap.jpg"></img>
```
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
```

Min Heap <br/>
```
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
```
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20201106115157/MinHeap.jpg"></img>
template
```java
    public class KthElement {
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
```
|Problem|Solution|
--------|--------
|[Kth Small Element](https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/basic/KthElement.java)
|[Kth Large Element](https://leetcode.com/problems/kth-largest-element-in-an-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/basic/KthElement.java)
|[K Sorted Array](https://www.techiedelight.com/sort-k-sorted-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/SortAKSortedArray.java)
|[K Closest Numbers](https://www.geeksforgeeks.org/find-k-closest-numbers-in-an-unsorted-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/KClosetNumbers.java)
|[Top K frequent numbers](https://www.geeksforgeeks.org/find-k-closest-numbers-in-an-unsorted-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/TopKFrequentNumbers.java)
|[Sort By Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/FrequencySort.java)
|[ K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/KClosestPointToOrigin.java)
|[Minimum Cost of ropes](https://practice.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/ConnectRopesMinimiseCost.java)
|[Sum b/w k1 and k2 smallest element](https://practice.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements3133/1)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/heap/patterns/SumBetweenK1K2Elements.java)
