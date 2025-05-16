
// Print the multiplication table of a number using the * operator.
import java.util.Scanner;
 public class fact_15
 
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number:");
        int n = sc.nextInt();
        int i = n;

        int fact = 1;
       

        while (i >= 1) {
            fact *= i;
            i--;
            System.out.println("Factorial of "+ n + " is" + fact);
            
       }
 }
}