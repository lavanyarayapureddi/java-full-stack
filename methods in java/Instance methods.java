//without parameter and return type
class Instance methods
{
public void add()
{
System.out.println(10+20);
}
public static void main(String[] args)
{
Methods m=new Methods();
m.add();
}
}

//without arguments and with return type
class Methods
{
public int sub()
{
System.out.println(30-20);
return (30-20);
}
public static void main(String[] args)
{
Methods m=new Methods();
m.sub();
}
}

//with arguments and with return type
class Methods
{
public int mul(int a,int b)
{
System.out.println(a*b);
return (a*b);
}
public static void main(String[] args)
{
Methods m=new Methods();
m.mul(3,2);
}
}

//with arguments and without return type
class Methods
{
public void div(int a,int b)
{
System.out.println(a/b);
}
public static void main(String[] args)
{
Methods m=new Methods();
m.div(10,5);
}
}