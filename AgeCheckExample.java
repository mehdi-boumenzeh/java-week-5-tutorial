public class AgeCheckExample {
    public static void main(String[] args) {
        
        testAge(20);  
        testAge(16);  
        testAge(18);  
    }

    public static void testAge(int age) {
        try {
            checkAge(age);
            System.out.println("(no exception)");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}