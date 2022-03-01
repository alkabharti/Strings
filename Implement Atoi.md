<h2> Implement Atoi : </h2>
Your task  is to implement the function atoi. The function takes a string(str) as argument and converts it to an integer and returns it.

Note: You are not allowed to use inbuilt function.

**Example 1:**

Input: <br/>
str = 123<br/>
Output: 123

**Example 2:**

Input:<br/>
str = 21a<br/>
Output: -1<br/>
Explanation: Output is -1 as all characters are not digit only.
  
-----------------------------------------------------------------------------------------------------------------------------------------------
  
<h3> Solution 1: </h3>

Time Complexity :

```java
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
```

-----------------------------------------------------------------------------------------------------------------------------------------------
  
<h3> Solution 2: </h3>

Time Complexity :

```java
int atoi(String str) 
{
    int i=0,res=0,f=-1;
    if(str.charAt(i)=='-')
    {
        f=1;
        i=1;
    }
    for(;i<str.length();i++)
    {
        if(str.charAt(i)>='0' && str.charAt(i)<='9')
            res=(res*10) + str.charAt(i)-'0';
        else
            return -1;
    }

    if(f==1)
        res=res * -1;
    return res;
}
```


