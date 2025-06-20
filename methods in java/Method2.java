class Method1
{
    int a=10;
    int b=20;
    static int c=30;
    static int d=40;

static{
    System.out.println("static 1");
}
static{
    System.out.println("static 2");
}
{
    System.out.println("Instance 1");
}
{
    System.out.println("Instance 2");
}
static void add(){
    System.out.println(c);
}
static void add2(){
    System.out.println(d);
}
void sub()
{
   
   System.out.println("sub");
}
void sub2()
{
    
   System.out.println("sub2");
}
}
class Method2
{
    int e=50;
    int f=60;
    static int g=70;
    static int h=80;

static{
    System.out.println("static 3");
}
static{
    System.out.println("static 4");
}
{
    System.out.println("Instance 3");
}
{
    System.out.println("Instance 4");
}
static void add3(){
    System.out.println(g);
}
static void add4(){
    System.out.println(h);
}
void sub3()
{
   System.out.println("sub3");
}
void sub4()
{
    
   System.out.println("sub4");
}

public static void main(String[] args)
{.
    System.out.println("executed");
    Method1 m1=new Method1();
  
   m1. add();
    m1.add2();
    m1.sub();
    m1.sub2();
   Method2 m2=new Method2();
   add3();
    add4();
    m2.sub3();
    m2.sub4();
}

}

