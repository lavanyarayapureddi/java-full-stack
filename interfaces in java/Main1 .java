interface Fruits 
{
    void pulp();
}
class Juice implements Fruits 
{
    public void pulp() 
    {
        System.out.println("Orange");
    }
}
public class Main1 
{
    public static void main(String[] args) {
        Juice j = new Juice();
        j.pulp();
        }
}


interface Animals {
    void Dog();
    void Cat();
}
abstract class DomesticAnimals1 implements Animals 
{
    public void Dog() 
    {
        System.out.println("Dog is a domestic animal.");
    }
}
class DomesticAnimals2 extends DomesticAnimals1
{
    public void Cat() 
    {
        
    }
}
public class Main 
{
    public static void main(String[] args) {
        DomesticAnimals2 d = new DomesticAnimals2();
        d.Dog();
        }
}



interface A 
{
    void Add();
}

interface B 
{
    void Sub();
}
class Operators implements A, B 
{
    public void Add() 
    {
        System.out.println("Method Add is running");
    }
    public void Sub() 
    {
        System.out.println("Method Sub is running");
    }
}
public class Main
{
    public static void main(String[] args) {
        Operators o = new Operators();
        o.Add();
        o.Sub();
        }
}




interface X 
{
    void show();
}

interface Y 
{
    void show();
}

class Demo implements X, Y 
{
    public void show() 
    {
        System.out.println("Interfaces");
    }
}
public class Main 
{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        }
        
}