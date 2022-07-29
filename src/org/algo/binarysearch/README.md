Binary Search Algorithm

<img src="https://dev.to/techlearners/binary-search-algorithm-explained-2nn5"></img>

template
```java
    public class BinarySearch {
    public int search(int array[], int element) {
        int start = 0, end = array.length-1, mid;
        while (start <= end) {
            // save us from integer overflow
            mid = start + (end-start)/2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] > element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
```
|Problem|Solution|
--------|--------
|[Binary Search](https://leetcode.com/problems/binary-search/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/basic/BinarySearch.java)
|[Binary Search in Reverse sorted array](https://www.geeksforgeeks.org/search-an-element-in-a-reverse-sorted-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/BinarySearchOnReverseSortedArray.java)
