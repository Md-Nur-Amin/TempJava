public class Calculator {

    
    public int add(int a, int b) { // add two integers
        return a + b;
    }

    public int subtract(int a, int b) { // subtract two integers
        return a - b;
    }

    public int multiply(int a, int b) { // multiply two integers
        return a * b;
    }

    
    public int divide(int a, int b) { // divide two integers with exception handling
    try {
        return a / b;
    } catch (Exception e) {
        System.out.println("Error: Division by zero is not allowed.");
        return 0;
    }
}

   
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Create Calculator object

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
        System.out.println("Division by zero: " + calc.divide(0, 5));
    }
}
