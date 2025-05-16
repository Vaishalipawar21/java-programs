import java.util.Scanner;
public class DisariumNumberChecker {
    // Function to count digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    // Function to check if a number is a Disarium number
    public static boolean isDisarium(int number) {
        int sum = 0;
        int digits = countDigits(number);
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            digits--;
            temp /= 10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
        scanner.close();
    }
}