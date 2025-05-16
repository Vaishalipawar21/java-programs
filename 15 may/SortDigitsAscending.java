import java.util.Arrays;
import java.util.Scanner;

public class SortDigitsAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        
        // Convert the number to a character array
        char[] digits = number.toCharArray();
        
        // Sort the character array
        Arrays.sort(digits);
        
        // Display the sorted digits
        System.out.println("Digits in ascending order: " + new String(digits));
        
        scanner.close();
    }
}
