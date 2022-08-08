Heap Patterns

Max Heap
```
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
```

Min Heap <br/>
```
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
```

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