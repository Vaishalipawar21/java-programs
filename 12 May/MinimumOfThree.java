

 //Find the minimum of three numbers. 
import java.util.Scanner;
public class MinimumOfthree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

               
        int min = findMinimum(num1, num2, num3,); 
        
        System.out.println("The minimum of the three numbers is: " + min);
        
        scanner.close();
    }
    public static int findMinimum(int a, int b, int c) {
        int min = a; // Assume a is the minimum
        if (b < min) {
            min = b; // Update min if b is smaller
        }
        if (c < min) {
            min = c; // Update min if c is smaller
        }
        return min; // Return the minimum value
    }
}