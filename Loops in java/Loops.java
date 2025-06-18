
// print naming for 10 times
public class Loops
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
        System.out.println("Bright IT future");
        }
    }
}


//print  1 to 20 using  while loops
public class Loops
{
    public static void main(String[] args)
    {
        int i=1;
        while(i<=20)
        {
            System.out.println(i);
            i++;
        }
    }
}


// equal to and not equal to operators
public class Loops
{
    public static void main(String[] args)
    {
       int a=10,b=20;
       System.out.println(a==b);
       System.out.println(a!=b);
    }
}


//even and odd numbers between 1 to 10
public class Loops
{
    public static void main(String[] args)
    {
       for(int i=1;i<=10;i++)
       {
           if(i%2==0)
           {
               System.out.println(i+"even");
           }
           else
           {
               System.out.println(i+"odd");
           }
       }
    }
}

//Largest of 3 numbers
public class Loops
{
    public static void main(String[] args) 
    {
        int a = 25, b = 42, c = 17;

        if(a >= b && a >= c) 
        {
            System.out.println(a + " is the largest");
        } 
        else if(b >= a && b >= c) 
        {
            System.out.println(b + " is the largest");
        } 
        else 
        {
            System.out.println(c + " is the largest");
        }
    }
}
// even betwwen 10 to 100 
public class Loops 
{
    public static void main(String[] args) 
    {
        int i=10;
        while(i<100)
        {
            if(i%2==0)
            {
                System.out.println(i);
                
            }
            i++;
        }
    }
}

//numbers between 1 to 10 using do-while
public class Loops
{
    public static void main(String[] args) 
    {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}
//armstrong
public class Loops
{
    public static void main(String[] args) 
    {
        int a=154;
        int temp=a;
        int sum=0;
        while(a>0)
        {
            int rem=a%10;
             sum+=rem*rem*rem;
             a=a/10;
        }
        if(sum==temp)
        {
            System.out.println("it is armstrong");
        }
        else
        {
            System.out.println("it is not");
        }
        
}



}

//prime or not 
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29; // You can change this number to test

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
    }
}

//palindrome
public class Loops
{
    public static void main(String[] args) 
    {
        int num = 121; 
        int original = num;
        int reverse = 0;

        while (num > 0) 
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse)
        {
            System.out.println(original + " is a Palindrome.");
        }
        else
        {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}

//even or odd using switch case
import java.util.Scanner;

public class Loops
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) 
        {
            case 0:
                System.out.println(num + " is Even");
                break;
            case 1:
                System.out.println(num + " is Odd");
                break;
        }
    }
}
//gender
import java.util.Scanner;

public class Loops
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (m/f): ");
        char gender = sc.next().charAt(0);  

        switch (gender) 
        {
            case 'm':
            case 'M':
                System.out.println("Gender is Male");
                break;

            case 'f':
            case 'F':
                System.out.println("Gender is Female");
                break;

        }
    }
}

//largest of 3
public class Loops
{
    public static void main(String[] args) 
    {
        int a =10,b = 20, c = 30;

        if(a >= b && a >= c) 
        {
            System.out.println(a + " is the largest");
        } 
        else if(b >= a && b >= c) 
        {
            System.out.println(b + " is the largest");
        } 
        else 
        {
            System.out.println(c + " is the largest");
        }
    }
}


