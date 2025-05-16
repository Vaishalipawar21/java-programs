

import java.util.Scanner;

public class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        String binaryRepresentation = decimalToBinary(decimalNumber);
        
        System.out.println("Binary representation: " + binaryRepresentation);
        
        scanner.close();
    }
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

}

}