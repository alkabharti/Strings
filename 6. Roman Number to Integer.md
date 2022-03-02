<h2> Roman Number to Integer : </h2>

Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below. <br/>
I 1<br/>
V 5<br/>
X 10<br/>
L 50<br/>
C 100<br/>
D 500<br/>
M 1000<br/>

**Example 1:**

Input: <br/>
s = V<br/>
Output: 5 <br/>

**Example 2:**

Input: <br/>
s = III <br/>
Output: 3 <br/>

---------------------------------------------------------------------------------------------------------------------------------------------

<h3>Solution :</h3>

Time Complexity : O(N)

```java
public int romanToDecimal(String str) 
{
    int res=0;
    int i;
    for(i=0;i<str.length();i++)
    {
        int s1=value(str.charAt(i));
        if(i+1 < str.length())
        {
            int s2=value(str.charAt(i+1));
            if(s1>=s2)
                res=res+s1;
            else
            {
                res+=s2-s1;
                i++;
            }
        }
        else
            res=res+s1;
    }
    return res;
}
public int value(char r)
{
    if (r == 'I')
        return 1;
    if (r == 'V')
        return 5;
    if (r == 'X')
        return 10;
    if (r == 'L')
        return 50;
    if (r == 'C')
        return 100;
    if (r == 'D')
        return 500;
    if (r == 'M')
        return 1000;
    return -1;
}
```
---------------------------------------------------------------------------------------------------------------------------------------------

<h3>G Solution :</h3>

Time Complexity : O(N)

```java
public int romanToDecimal(String str) {
    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
    hmap.put('I',1);
    hmap.put('V',5);
    hmap.put('X',10);
    hmap.put('L',50);
    hmap.put('C',100);
    hmap.put('D',500);
    hmap.put('M',1000);

    int x = hmap.get(str.charAt(0));
    int l = str.length();
    if(l==1)
    {
        return x;
    }
    int i=1;
    while(i<l)
    {
        int vi = hmap.get(str.charAt(i));
        int v_prev = hmap.get(str.charAt(i-1));
        if(v_prev<vi)
        {
            x = x + vi - 2*v_prev;
        }
        else
        {
            x = x + vi;
        }
        i++;
    }
    return x;
}
```

