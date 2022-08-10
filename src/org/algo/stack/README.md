[# Stack

<img src="https://static.javatpoint.com/core/images/java-stack.png"></img>

Useful methods

<table class="alt">
<tbody><tr>
<th>Method</th>
<th>Modifier and Type</th>
<th>Method Description</th>
</tr>
<tr>
<td><a href="#empty">empty()</a></td>
<td>boolean</td>
<td>The method checks the stack is empty or not.</td>
</tr>
<tr>
<td><a href="#push">push(E item)</a></td>
<td>E</td>
<td>The method pushes (insert) an element onto the top of the stack.</td>
</tr>
<tr>
<td><a href="#pop">pop()</a></td>
<td>E</td>
<td>The method removes an element from the top of the stack and returns the same element as the value of that function.</td>
</tr>
<tr>
<td><a href="#peek">peek()</a></td>
<td>E</td>
<td>The method looks at the top element of the stack without removing it.</td>
</tr>
<tr>
<td><a href="#search">search(Object o)</a></td>
<td>int</td>
<td>The method searches the specified object and returns the position of the object.</td>
</tr>
</tbody></table>

template for Nearest elements
```
Stack stack = new Stack()
for loop [1-N or N to 1]{
    while(stack not empty and stack.peek() failed to meet condition)
    {
        stack.pop();
    }
    tempAns = stack.isEmpty()?-1:stack.peek()
    stack.push(currentValue)
    }
```
|Problem|Solution|
--------|--------
|[Next Largest Element](https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/NextLargestElement.java)
|[Next Smaller Left Element](https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/NearestSmallerToLeft.java)
|[Stock Span](https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/StockSpanProblem.java)
|[Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/MaximumAreaHistogram.java)
|[Maximal Rectangle in Binary Array](https://leetcode.com/problems/maximal-rectangle/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/MaxAreaOfRectangleInBinaryMatrix.java)
|[Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/RainWaterTrapping.java)
|[Min Stack](https://leetcode.com/problems/min-stack/)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/MinimumElementInStack.java)
|[Min Stack without Extra Space](https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack)| [Solution](https://github.com/ravindra-gadiparthi/algorithm/blob/main/src/org/algo/stack/basic/MinStackWithoutExtraSpace.java)