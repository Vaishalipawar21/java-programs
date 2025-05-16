
//Print all Dicerium numbers up to N. 

import java.util.Scanner;

public class DiceriumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        System.out.println("Dicerium numbers up to " + N + ":");
        printDiceriumNumbers(N);
        
        scanner.close();
    }

    public static void printDiceriumNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            if (isDiceriumNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isDiceriumNumber(int num) {
        for (int i = 0; i * i <= num; i++) {
            for (int j = 0; j * j <= num; j++) {
                if (i * i + j * j == num) {
                    return true; // Found a pair (i, j) such that i^2 + j^2 = num
                }
            }
        }
        return false; // No such pair found
    }
}
