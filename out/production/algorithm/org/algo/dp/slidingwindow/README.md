# algo
This Repo contains Basic Algorithm problems patterns and problems matching the problem pattern

#Sliding Window

[Sliding Window](/org/algo/dp/slidingwindow/README.md)

Fixed Window Template

```
int i,j,tempCalculation
while(j<array.length){
calculations
if(condition < k){
j++
}else if(condition == k)
{
    answer = from calculations
    j++
    i++
}

return finalResult
```

Variable Size Window Template 

(Longest SubString with K repeating chars) [https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/]
(Longest SubString with Unique Characters) [https://leetcode.com/problems/longest-substring-without-repeating-characters/]

```

int i,j,tempCalculation
while(j<array.length){
calculations
if(condition < k){
j++
}else if(condition == k)
{
    answer = from calculations
    j++
}else if(condition>k){
    while(condition>k)
    {
        remove the caculations of i;
        i++
        j++;
    }
}

```