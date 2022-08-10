# Knapsack Problem and the related problems

##Problem Description
The knapsack problem is a problem in combinatorial optimization: Given a set of items, each with a weight and a value, determine the number of each item to include in a collection so that the total weight is less than or equal to a given limit and the total value is as large as possible.
It derives its name from the problem faced by someone who is constrained by a fixed-size knapsack and must fill it with the most valuable items.
The problem often arises in resource allocation where the decision-makers have to choose from a set of non-divisible projects or tasks under a fixed budget or time constraint, respectively.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Knapsack.svg/1200px-Knapsack.svg.png"></img>

<pre>
Given weight and number of items
Initialize a table n+1,weight+1
DP[0][] = 0
DP[][0] = 0
Start from DP[1][1]
    If WT[i-1] < j
        DP[i][j] = Math.max(vals[i-1]+ DP[i-1][j-wt[i-1]],DP[i-1][j]);
    Else
        DP[i][j] = DP[i-1][j]
</pre>