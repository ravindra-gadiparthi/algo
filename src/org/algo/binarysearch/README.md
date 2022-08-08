Binary Search Algorithm

<img src="https://res.cloudinary.com/practicaldev/image/fetch/s--Uj818KRw--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/i/5hsod7t93v85b23rk671.png"></img>

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
|[First&Last Occurrence of element](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/FirstAndLastOccurrence.java)|
|[# of Rotations in Sorted Array](https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/RotationInSortedArray.java)|
|[Min Element in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/RotationInSortedArray.java)|
|[Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/FindElementInRotatedSortedArray.java)|
|[Find Element in nearly sorted Array](https://www.geeksforgeeks.org/search-almost-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/FindElementInNearlySortedArray.java)|
|[Single Duplicate element](https://leetcode.com/problems/search-in-rotated-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/SingleNonDuplicateValue.java)|
|[Floor in Sorted Array](https://www.geeksforgeeks.org/floor-in-a-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/FloorInSortedArray.java)|
|[Ceil in Sorted Array](https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/CeilInSortedArray.java)|
|[Search Insert Position](https://leetcode.com/problems/search-insert-position/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/SearchInsertPosition.java)|
|[Smallest Letter grater than target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/FindNextAlphabet.java)|
|[Min Diff in a sorted array](https://www.callicoder.com/minimum-difference-element-in-sorted-array/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/MinDiffInSortedArray.java)|
|[Find Peak Element](https://leetcode.com/problems/find-peak-element/solution/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/FindPeakElement.java)|
|[Allocate minimum number of pages](https://www.geeksforgeeks.org/allocate-minimum-number-pages/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/binarysearch/patterns/MaxAllocatedPages.java)|


