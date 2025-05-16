import java.util.Scanner;
public class divible_2
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it is divisible by 17: ");
        
        if(scanner.hasNextInt()) {

            int number = scanner.nextInt();
            if(number % 17 == 0) {
                System.out.println(number + " is divisible by 17.");
            } else {
                System.out.println(number + " is not divisible by 17.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
