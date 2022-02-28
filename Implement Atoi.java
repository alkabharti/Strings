Implement Atoi : 
Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
str = 123
Output: 123

Example 2:

Input:
str = 21a
Output: -1
Explanation: Output is -1 as all characters are not digit only.
  
-----------------------------------------------------------------------------------------------------------------------------------------------
  
Solution 1:

Time Complexity :

int atoi(String str) 
{
    try
    {
        return Integer.parseInt(str);    
    }
    catch(Exception e)
    {
        return -1;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------
  
Solution 2:

Time Complexity :


