
import java.util.Scanner;
public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'Welcome': ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Welcome");
        }
        scanner.close();
    }
}
