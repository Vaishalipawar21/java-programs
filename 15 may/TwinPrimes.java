
import java.util.Scanner;

public class TwinPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        System.out.println("Twin primes up to " + N + ":");
        printTwinPrimes(N);
        
        scanner.close();
    }

    public static void printTwinPrimes(int N) {
        int previousPrime = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                if (previousPrime != 0 && (i - previousPrime == 2)) {
                    System.out.println("(" + previousPrime + ", " + i + ")");
                }
                previousPrime = i;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
