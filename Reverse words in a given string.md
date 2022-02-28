<h2> Reverse words in a given string </h2>
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

**Example 1:**

Input: <br/>
S = i.like.this.program.very.much <br/>
Output: much.very.program.this.like.i <br/>
Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i

**Example 2:**

Input: <br/>
S = pqr.mno <br/>
Output: mno.pqr <br/>
Explanation: After reversing the whole string , the input string becomes mno.pqr

-----------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity : O(|S|)

```java
String reverseWords(String S)
{
    String[] str=S.split("\\.");
    int i;
    String ans="";
    int n=str.length;
    ans+=str[n-1];
    for(i=str.length-2;i>=0;i--)
    {
        ans+=".";
        ans+=str[i];
    }
    return ans;
}
```

-----------------------------------------------------------------------------------------------------------------------------------------

<h3> G Solution : </h3>

Time Complexity : O(|S|)

```java
String reverseWords(String S)
{
    // code here
    int n = S.length();
    String r = "";
    String s = "";
    for(int i =0; i < n ; i++)
    {
        char c = S.charAt(i);
        if(c=='.')
        {
            r = "."+s+r;
            s = "";
        }
        else if(i==n-1)
        {
            s = s + c;
            r = s + r;
        }
        else
        {
            s = s + c;

        }
    }
    return r;
}
```
