
import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        System.out.println("Magic numbers up to " + N + ":");
        printMagicNumbers(N);
        
        scanner.close();
    }

    public static void printMagicNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            if (isMagicNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isMagicNumber(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow); // Move slow by one step
            fast = sumOfSquares(sumOfSquares(fast)); // Move fast by two steps
        } while (slow != fast);

        return slow == 1; // If slow is 1, then it's a magic number
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
