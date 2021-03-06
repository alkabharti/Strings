Anagram : 
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. 
An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, act and tac are an anagram of each other.

Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have samecharacters with same frequency. So, both are anagrams.

  Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation:Characters in both the strings are not same, so they are not anagrams.
  
-----------------------------------------------------------------------------------------------------------------------------------------------------
  
Solution : 

Time Complexity : O(|a| + |b|)
  
public static boolean isAnagram(String a,String b)
{
    if(a.length()!=b.length())
        return false;
    else
    {
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
            return true;
    }
    return false;
}

-----------------------------------------------------------------------------------------------------------------------------------------------------
  
G Solution : 

Time Complexity : O(|aloga| + |blogb|)
  
# Sort both the strings and compare them
  
public static boolean isAnagram(String a,String b)
{
    char a1[] = a.toCharArray();
    Arrays.sort(a1);
    char b1[] = b.toCharArray();
    Arrays.sort(b1);
    int n = a.length();
    int m = b.length();
    if (n!=m)
      return false;
    for(int i=0;i<n;i++) # Arrays.equals(arr1,arr2) can be used for below code
    {
        if(a1[i]!=b1[i])
          return false;
    }
    return true; 
}

G Solution 2 : 

Time Complexity : O(|a| + |b|)
  
# Store the characters of both the strings in HashMap and compare the Hashmaps

public static boolean isAnagram(String a,String b)
{
    // Your code here
    int la = a.length();
    int lb = b.length();
    if(la != lb)
    {
        return false;
    }
    HashMap<Character, Integer> ha = new HashMap<Character, Integer>();
    HashMap<Character, Integer> hb = new HashMap<Character, Integer>();
    for(int i=0; i<la ;i++)
    {
        char c = a.charAt(i);
        if(ha.containsKey(c))
        {
            ha.put(c,ha.get(c)+1);
        }
        else
        {
            ha.put(c,1);
        }
    }
    for(int i=0; i<lb ;i++)
    {
        char c = b.charAt(i);
        if(hb.containsKey(c))
        {
            hb.put(c,hb.get(c)+1);
        }
        else
        {
            hb.put(c,1);
        }
    }
    return ha.equals(hb);
}
