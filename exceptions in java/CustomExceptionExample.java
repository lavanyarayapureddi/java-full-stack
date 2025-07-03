//custom exception
class MyOwnException extends Exception {
    public MyOwnException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void checkAge(int age) throws MyOwnException {
        if (age < 18) {
            throw new MyOwnException("Age is below 18. Not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyOwnException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

//Arithmetic exception without exception handling
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println("Result: " + result);
    }
}


//using arthmetic exception
public class ArithmeticExceptionHandled {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught: " + e.getMessage());
        }
    }
}


//multiple catch blocks
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[1] / 0;
            System.out.println("Result: " + result);
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception Caught: " + e.getMessage());
        }
    }
}

