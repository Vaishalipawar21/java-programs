import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check divisibility
        if (isDivisibleBy5And7(number)) {
            System.out.println(number + " is divisible by both 5 and 7.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 7.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check divisibility by 5 and 7
    public static boolean isDivisibleBy5And7(int num) {
        return (num % 5 == 0) && (num % 7 == 0);
    }
}

