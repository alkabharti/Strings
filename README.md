# Strings

```java
a) char ch='P'
      int ascii=(int)ch;
      System.out.println(ascii);

```

```java

b) int ln = str.length();  
    for (int i=0; i<ln; i++) 
    { 
        if (str[i]>='a' && str[i]<='z') 
        //Convert lowercase to uppercase 
            str[i] = str[i] - 32; 
        else if(str[i]>='A' && str[i]<='Z') 
        //Convert uppercase to lowercase 
            str[i] = str[i] + 32; 
    } 
```
