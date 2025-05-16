import java.util.Scanner;
public class StrongNumberChecker {
    // Function to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) 
    {
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += factorial(digit); // Add the factorial of the digit to sum
            number /= 10; // Remove the last digit
        }
        return sum == originalNumber; // Check if sum of factorials equals the original number
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
        scanner.close();
    }
}