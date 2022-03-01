<h2> Longest Common Prefix in an Array : </h2>
Given a array of N strings, find the longest common prefix among all strings present in the array.

**Example 1:**

Input: <br/>
N = 4 <br/>
arr[] = {geeksforgeeks, geeks, geek, geezer} <br/>
Output: gee <br/>
Explanation: "gee" is the longest common prefix in all the given strings.

**Example 2:**

Input: <br/>
N = 2 <br/>
arr[] = {hello, world} <br/>
Output: -1 <br/>
Explanation: There's no common prefix in the given strings.

------------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity :

```java
String longestCommonPrefix(String arr[], int n)
{
    int max=arr[0].length();
    String ans="";
    int i,c=0,f=0,j;
    for(i=1;i<n;i++)
    {
        if(max > arr[i].length())
        {
            max=arr[i].length();
            c=i;
        }
    }
    for(i=0;i<max;i++)
    {
        f=0;
        for(j=0;j<n-1;j++)
        {
            if(arr[j].charAt(i)!=arr[j+1].charAt(i))
            {
                f=1;
                break;
            }
        }
        if(f==0)
        ans+=arr[c].charAt(i);
        else
            break;
    }
    if(ans.length()==0)
        return "-1";
    else
        return ans;
}
```


