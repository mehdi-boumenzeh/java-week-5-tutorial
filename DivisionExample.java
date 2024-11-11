import java.util.Scanner;
public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("donner la valeur de a : ");
        int a=scanner.nextInt();
        System.out.println("donner la valeur de b : ");
        int b=scanner.nextInt();
        System.out.println(divideNumbers(a, b));

    }

    public static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}
