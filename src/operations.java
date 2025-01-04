public class operations{
    public static void main(String[] args) {
        int a = 12;
        int b=5;
        int addition = a+b;
        System.out.println(a + " + " + b + " = " + addition);
        int subtraction = a - b;
        System.out.println(a + " - " + b + " = " + subtraction);
        int multiplication = a * b;
        System.out.println(a + " * " + b + " = " + multiplication);
        int division = a / b;
        System.out.println(a + " / " + b + " = " + division);
        float fdivision = (float)a / b;
        System.out.println(a + " / " + b + " = " + fdivision+ " Typecasted");

        int modulus = a % b;
        System.out.println(a + " % " + b + " = " + modulus);

        // Increment operator
        int increment = a;  //12
        increment++;
        System.out.println(a + " incremented is " + increment);

        // Decrement operator
        int decrement = a;    //12
        decrement--;
        System.out.println(a + " decremented is " + decrement);

        // Float operations
        float x = 15.5f;
        float y = 4.5f;

        // Addition
        float floatAddition = x + y;
        System.out.println(x + " + " + y + " = " + floatAddition);

        // Subtraction
        float floatSubtraction = x - y;
        System.out.println(x + " - " + y + " = " + floatSubtraction);

        // Multiplication
        float floatMultiplication = x * y;
        System.out.println(x + " * " + y + " = " + floatMultiplication);

        // Division
        float floatDivision = x / y;
        System.out.println(x + " / " + y + " = " + floatDivision);

        // Modulus
        float floatModulus = x % y;
        System.out.println(x + " % " + y + " = " + floatModulus);
    }
}

