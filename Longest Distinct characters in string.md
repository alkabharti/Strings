<h2> Longest Distinct characters in string : </h2>
Given a string S, find length of the longest substring with all distinct characters. 

**Example 1:**

Input: <br/>
S = "geeksforgeeks" <br/>
Output: 7 <br/>
Explanation: "eksforg" is the longest substring with all distinct characters.

**Example 2:**

Input: <br/>
S = "aaa" <br/>
Output: 1 <br/>
Explanation: "a" is the longest substring with all distinct characters.

----------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity :

```java
class Solution
{
    static int longestSubstrDistinctChars(String S)
    {
        int ans=find(0,S);
        return ans;
    }
    public static int find(int i,String str)
    {
        if(i==str.length())
            return 0;
        int j,c=0,m=0;
        HashSet<Character> arr=new HashSet<Character>();
        for(j=i;j<str.length();j++)
        {
            if(!arr.contains(str.charAt(j)))
            {
                arr.add(str.charAt(j));
                c++;
            }
            else
                break;
        }
        return Integer.max(c,find(i+1,str));
    }
}
```


