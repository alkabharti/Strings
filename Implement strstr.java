Implement strstr : 
Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. 
The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.
  
Example 1:

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the string GeeksForGeeks as substring.
 

Example 2:

Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring in GeeksForGeeks from index 5 (0 based indexing).
  
------------------------------------------------------------------------------------------------------------------------------------------------------------
  
Solution 1 :

Time Complexity :

int strstr(String s, String x)
{
    if(s.contains(x))
        return s.indexOf(x);
    else
        return -1;
}

------------------------------------------------------------------------------------------------------------------------------------------------------------
  
Solution 2 :

Time Complexity :

