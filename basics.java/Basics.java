//create a class ,object,method,and its signature
class Basics
{
   void message()
   {
       System.out.println("hello");
   }
   public static void main(String[] args)
   {
       Basics a=new Basics();
       System.out.println("hi");
       a. message();
   }
}

class Name
{
    public static void main(String[] args)
    {
        System.out.println("lavanya");
    }
}


public class Comments
{
    public static void main(String[] args)
    {
        /* this is a multi-line comment
        in java*/
        System.out.println("Multiline comment");
        //this is single line
        System.out.println("this is single comment");
    }
    }



class variables
    {
        public static void main(String[] args)
        {
            int a=10;
            float b=20.0f;
            boolean d=true;
            double c= 22.22;
            System.out.println(a);
             System.out.println(b);
              System.out.println(d);
               System.out.println(c);
            
            
            
        }
    }
    


class Localglobal
{
    int globalVar = 5; 

    void display() 
    {
        int localVar = 10;
        System.out.println("Global: " + globalVar);
        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}

class Name
{
        static void name()
        {
            System.out.println("Lavanya");
        }
        public static void main(String[] args)
        {
            name();
        }
    }

