Remove Duplicates:
Given a string without spaces, the task is to remove duplicates from it.
Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first occurrence

Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first occurrence

--------------------------------------------------------------------------------------------------------------------------------

Solution 1 : Using ArrayList

Time Complexity : O(|S|)


String removeDups(String S) 
{
    ArrayList<Character> ch=new ArrayList<Character>();
    int i;
    String str="";
    for(i=0;i<S.length();i++)
    {
        if(!ch.contains(S.charAt(i)))
        {
            ch.add(S.charAt(i));
            str+=S.charAt(i);
        }
    }
    return str;
}

--------------------------------------------------------------------------------------------------------------------------------

Solution 2 : Using HashSet

Time Complexity : O(|S|)


String removeDups(String S) 
{
    HashSet<Character> ch=new HashSet<Character>();
    int i;
    String str="";
    for(i=0;i<S.length();i++)
    {
        if(!ch.contains(S.charAt(i)))
        {
            ch.add(S.charAt(i));
            str+=S.charAt(i);
        }
    }
    return str;
}

--------------------------------------------------------------------------------------------------------------------------------

G Solution

Time Complexity : O(|S|)

# HashSet Method
    
String removeDups(String S) {
    HashSet<Character> hs = new HashSet<Character>();
    String res = "";
    for(int i=0;i<S.length();i++)
    {
        char c = S.charAt(i);
        if(!hs.contains(c))
        {
            hs.add(c);
            res = res + c;
        }
    }
    return res;
}
