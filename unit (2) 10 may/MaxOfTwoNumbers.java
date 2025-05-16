import java.util.Scanner;
public class MaxOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Find the maximum of the two numbers
        int max = findMaximum(num1, num2);
        
        // Display the result
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to find the maximum of two numbers
    public static int findMaximum(int a, int b) {
        return (a > b) ? a : b;
    }
}
