# algo
This Repo contains Sliding Window problems and some problems with solved with sliding window pattern

#Sliding Window

[Sliding Window](/org/algo/slidingwindow/README.md)

Fixed Window Template

``` 
     int =0 ,j=0;
     while(j<0){
         apply logic to find out temp solution
         slide the window until it reaches size
           if(j-i+1 < k){
            j++
            }
          //logic when it reaches the window
            else if(j-i+1 == k){
            find out answer from temp solution
            //i++
            //j++
            }
        }    
        return finalResult
```
|Problem|Solution|
--------|--------
|[Max Sum of Sub Array](https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/slidingwindow/fixed/basic/EfficientSolution.java)
|[Max of Sub Array](https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k-using-stack-in-on-time)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/slidingwindow/fixed/patterns/MaxElementInSubArray.java)
|[First -ve Integer in every subarray](https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/slidingwindow/fixed/patterns/FirstNegativeNumberInWindow.java)
|[Count of anagrams](https://www.geeksforgeeks.org/count-occurrences-of-anagrams/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/slidingwindow/fixed/patterns/CountAnagramOccurrences.java)

Variable Size Window Template

```
int i,j,tempCalculation
for(int j=0;j<array.length;j++){
    pre Calculations
    if(condition==target){
        findout answer
    }else if(condition>k){
        while(condition>k){
            remove calculations
            i++
        }
    }
}


```
|Problem|Solution|
--------|--------
|[Longest Subarray with Sum K](https://www.geeksforgeeks.org/longest-sub-array-sum-k/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/dp/slidingwindow/variable/basic/LongestSubArrayWithSum.java)
|[Longest SubString with K repeating chars](https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/dp/slidingwindow/variable/pattern/LongestSubStringWithKUniqueChar.java)
|[Longest SubString with Unique Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/dp/slidingwindow/variable/pattern/LongestSubStringWithKUniqueChar.java)
|[Minimum Window Substrubg](https://leetcode.com/problems/minimum-window-substring/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/dp/slidingwindow/variable/pattern/MinWindowSubString.java)|
|[Pick Toys/Pick Fruits](https://leetcode.com/problems/fruit-into-baskets/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/dp/slidingwindow/variable/pattern/PickMaxFruits.java)|
|[Min sub array with sun](https://leetcode.com/problems/minimum-size-subarray-sum/)|[Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/dp/slidingwindow/variable/pattern/MinSizeSumSubArray.java)|