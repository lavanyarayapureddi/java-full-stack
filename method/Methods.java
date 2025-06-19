//2 static,instance methods and variables
class Methods
{
    static int a=10;
    static int b=20;
    int c=30;
    int d=40;
    static void s1()
    {
        System.out.println("static method 1");
    }
    static void s2()
    {
         System.out.println("static method 2");
         System.out.println(a);
      System.out.println(b);
    }
     
      void instancemethod1()
      {
          System.out.println("instance method1");
      }
      void instancemethod2()
      {
          System.out.println("instance  method2 ");
      }
      public static void main(String[] args){
          Methods a=new Methods();
          a.s1();
          a.s2();
          
          System.out.println("executed successfully");
          
      }
/* output

     static method 1
static method 2
10
20
executed successfully
*/
      
      }




//print instance variables in static method
class Instancevar
{
    int a=10;
    int b=20;
    static void greet()
    {
        Instancevar obj=new Instancevar();
        System.out.println(obj.a);
        System.out.println(obj.b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("executed succesfully");
        greet();
    }
}

//output:
/*
executed succesfully
10
20*/


//print staic variable in instance class
public class Instancevar
{
    static int a=10;
    static int b=20;
    void greet()
    {
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("hi");
        Instancevar obj=new Instancevar();
        obj.greet();
        
    }
}
/*
Output
hi
10
20
*/



//call instance methods in static methods
class Static 
{
    void show() 
    {
        System.out.println("This is instance method");
    }

    
    public static void  main(String[] args) 
    
    {
        System.out.println("successful");
        Static obj = new Static();
        obj.show();  
    }
}


//call static methods in instance methods
class Instancevar 
{
    static void show() 
    {
        System.out.println("This is a static method");
    }

    
    public void display() 
    {
        System.out.println("Inside instance method");
        show(); 
    }

    public static void main(String[] args) 
    {
        Instancevar obj = new Instancevar(); 
        obj.display();  
    }
}


class Static
{

   
    static int a = 10;
    static int b= 20;

    int c = 30;
    int d= 40;

    public static void main(String[] args) 
    {
       
        Static obj = new Static();
        System.out.println(a);
        System.out.println(b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}


 //Call static methods and instance methods in main method
 class Static{
    static void Method() {
        System.out.println("This is a static method.");
    }
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        Method();
        Static obj = new Static();
        obj.instanceMethod();
    }
}

