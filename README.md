# Strings 

### a) Find ASCII value of a character.

```java
a) char ch='P'
      int ascii=(int)ch;
      System.out.println(ascii);

```

### b) Convert case of a character in a string.

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
