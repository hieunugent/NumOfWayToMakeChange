# NumberOfWaysToMakeChange
- given an array of positive integer which representing coin denominations 
- and a single non- negative integer n representing a target amount of money
- write a function that return ways number to make a change for giving target amount of money
- example : n = 6 , demons = [1, 5]
- the output should be 2;
- time complexity is O(nD) n is number of target number, D is the Number of Denomination  length
- Space COmplexity is O(n) is the number of Target number, which used to hold the ways 
# Pseudocode:
- get an array to hold the ways of change which has the size as the number of target +1 .
- sorted the denomination array
- start as the first index of denomination 
- if the denomuation.value is <= amount 
  - 0 1 2 3 4 5 6
  - 1 1 1 1 1 1 1 for 1 with the fomular is ways[i] = ways[i-1] with bash ways[0] = 1;
  - 1 1 1 1 1 2 1 for 5 ways[5] = ways[5-5]+ way[5] = ways[0] + ways[5] = 1 + 1 = 2 
  - 1 1 1 1 1 2 2 for ways[6] = ways[6-5] +ways[6] = ways[1] +ways[6] = 1 +1 = 2
 - return the last index of ways;
 
  
  

