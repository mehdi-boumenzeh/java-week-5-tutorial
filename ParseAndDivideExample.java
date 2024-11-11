public class ParseAndDivideExample {
    public static void main(String[] args) {
        
        parseAndDivide("10", "2");   // Expected output: 5
        parseAndDivide("ten", "2");  // Expected output: Invalid input. Please enter valid numbers.
        parseAndDivide("10", "0");   // Expected output: Cannot divide by zero.
    }

    public static void parseAndDivide(String num1, String num2) {
        try {
            int a = Integer.parseInt(num1);
            try {
                int b = Integer.parseInt(num2);
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
