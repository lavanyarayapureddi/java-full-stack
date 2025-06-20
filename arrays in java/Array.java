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


//add element
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] oldArray = {1, 2, 3, 4};
        System.out.println("Old Array:");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i] + " ");
        }
        System.out.print("\nEnter number to add: ");
        int newNumber = sc.nextInt();
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = newNumber;
        System.out.println("New Array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }
}

//finding max and min
public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 25, 8, 15};

        
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
           
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

//reverse of an array
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
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

//remove of an element
class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int target=3;
int b[]=new int[(a.length)-1];
int j= 0;
for(int i=0;i<a.length;i++)
{
if(a[i]!=target)
{
b[j]=a[i];
j++;
}
}
for( int i=0;i<b.length;i++)
{
System.out.println(b[i]+" ");
}
}
}

//copy of one array into another array
class Arrays
{
public  static void main(String[] args)
{
int a[]={1,2,5,6,7};
int b[]=new int[(a.length)-1];
for(int i=0; i<b.length; i++)
{
b[i]=a[i];
System.out.print(a[i]+" ");
System.out.println(" ");
}
for(int i=0; i<b.length; i++)
{
System.out.print(b[i]+" ");
}
}
}


//dupliacte element in an array
public class Array
{
public static void main (String[] args)
{
int a[]={1,2,3,4,5};
for(int i=0;i<a.length;i++)
{
    for(int j=i+1;j<a.length;j++)
    {
        if(a[i]==a[j])
        {
            System.out.println("duplicate element :"+a[i]);
        }
        
        
    }
}
System.out.println("Not found  duplicate element");
}
}


//removing duplicate element from the array
public class Array {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 5}; 
        int temp[] = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[k] = a[i];
                k++;
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

