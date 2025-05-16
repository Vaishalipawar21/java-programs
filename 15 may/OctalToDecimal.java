
import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();
        
        try {
            // Convert octal string to decimal
            int decimalValue = Integer.parseInt(octalString, 8);
            System.out.println("Decimal value: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number.");
        } finally {
            scanner.close();
        }
    }
}
