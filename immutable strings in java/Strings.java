//Differnt ways of creating Strings
class Strings
{
    public static void main(String[] args)
    {
        String s1="lavanya";
        String s2=new String("sviet");
        System.out.println(s1);
        System.out.println(s2);
        
    }
}


//concatination of Strings
class Strings
{
    public static void main(String[] args)
    {
        String s1="lavanya";
        String s2="puji";
        String s3=new String("sviet");
        System.out.println(s1);
        System.out.println(s2);
         System.out.println(s3);
          System.out.println(s1+s2);
           System.out.println(s2+s3);
            System.out.println(s3+s1);
        
        
    }
}


//lenth of Strings
class Strings
{
    public static void main(String[] args)
    {
        String s1="lavanya";
        String s2="puji";
        String s3=new String("sviet");
        System.out.println(s1.length());
        System.out.println(s2.length());
         System.out.println(s3.length());
        
        
        
    }
}


//extract a string using substring
class Strings
{
    public static void main(String[] args)
    {
        String s1="sailavanya";
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(0,3));
       
        
        
    }
}

//searching in strings using of indexOf()
class Strings
{
    public static void main(String[] args)
    {
        String s1="sailavanya";
        System.out.println(s1.indexOf('a'));
         System.out.println(s1.indexOf('s'));
         System.out.println(s1.lastIndexOf('a'));
        
       }
}

//comparing strings using equals methods
class Strings
{
    public static void main(String[] args)
    {
        String s1="sailavanya";
        String s2="sailavanya";
        String s3="puji";
        System.out.println(s1==s2);
         System.out.println(s1.equals(s2));
         System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
       
       
        
        
    }
}


//comparing strings using equals methods
class Strings
{
    public static void main(String[] args)
    {
        String s1="sailavanya";
        String s2=  new String("sailavanya");
        String s3="puji";
        System.out.println(s1==s2);
         System.out.println(s1.equals(s2));
         System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
       
       
        
        
    }
}

//startswith ,endswith.compareTo,equalsIgnoreCase methods
class Strings
{
    public static void main(String[] args)
    {
        String s1="sailavanya";
        String s2=  "sailavanya";
        String s3="Sailavanya";
        System.out.println(s1.startsWith("sai"));
         System.out.println(s1.endsWith("a"));
         System.out.println(s1.compareTo(s2));
         System.out.println(s3.compareTo(s1));
         System.out.println(s1.equalsIgnoreCase(s3));
         String s4=new String("sailavanya");
         System.out.println(s1.compareTo(s4));
        
        }
}

//trimming string methods
class Strings
{
    public static void main(String[] args)
    {
        String s1="     sailavanya ";
         System.out.println(s1.trim( ));
        }
}

//replacing the characters
class Strings
{
    public static void main(String[] args)
    {
        String s1="lav";
        System.out.println("original string is :"+s1);
        String s2=s1.replace("lav","lavanya");
        System.out.println("replaced string is :"+s2);
    }
}


//converting a number into a string using valueOf()
class Strings
{
    public static void main(String[] args)
    {
        int a=2025;
        String s1=String.valueOf(a);
        System.out.println(s1);
        System.out.println(s1.length());
    }
}

//converting lowercase and uppercase
class Strings
{
    public static void main(String[] args)
    {
        String s1="lavanya";
       System.out.println(s1.toUpperCase());
       String s2="LAVANYA";
       System.out.println(s2.toLowerCase());
       String s3="Lavanya";
       System.out.println(s3.toLowerCase());
       String s4="LAVANYA";
        System.out.println(s4.toUpperCase());
       
    }
}

//converting integer object to string
class Strings
{
    public static void main(String[] args)
    {
        int a=123;
        String s1=Integer.toString(a);
        System.out.println(s1);
       
    }
}


//spliting of  a string
import java.util.Arrays;

class Strings {
    public static void main(String[] args) {
        String s1 = "sailavanya";
        String[] s2 = s1.split("i");
        System.out.println(Arrays.toString(s2));
    }
}


//matching a string in regular expressions
class Expressions
{
    public static void main(String[] args)
    {
        String reg="[a-zA-Z]+\\d+";
        String a="java44";
        System.out.println(a.matches(reg));
    }
}
