<h2> Check if string is rotated by two places : </h2>
Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

**Example 1:**

Input: <br/>
a = amazon <br/>
b = azonam <br/>
Output: 1 <br/>
Explanation: amazon can be rotated anti clockwise by two places, which will make it as azonam.

**Example 2:**

Input: <br/>
a = geeksforgeeks <br/>
b = geeksgeeksfor <br/>
Output: 0 <br/>
Explanation: If we rotate geeksforgeeks by two place in any direction , we won't get geeksgeeksfor.

------------------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity : O(N)

```java
public static boolean isRotated(String str1, String str2)
{
    String clock_wise="";
    String anticlock_wise="";
    if(str1.length() != str2.length())
        return false;
    if(str1.length()<2)
        return str1.equals(str2);

    clock_wise+=str2.substring(2)+str2.substring(0,2);
    anticlock_wise+=str2.substring(str2.length()-2, str2.length())+str2.substring(0,str2.length()-2);

    if(str1.equals(clock_wise) || str1.equals(anticlock_wise))
        return true;
    return false;
}
```

