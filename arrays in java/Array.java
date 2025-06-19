// sum of elements in an array
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int sum=0;
for(int b:a)
{
 sum=sum+b;
}
System.out.println(sum);
}
}


//avg of array elements
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int sum=0;
float avg=0;
for(int b:a)
{
 sum+=b;
avg=sum/2;
}
System.out.println(sum);
System.out.println(avg);
}
}

//index of an paticular element
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
 int target=4;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
System.out.println(i);
}
}
}
}


// array conatins specific element or  not
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
 int target=4;
int count=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
count++;
}

}
if(count==1)
{
System.out.println("element found at position");
}
else
{
System.out.println("element is not found");
}
}
}



