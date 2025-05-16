
import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
     {                  
         Scanner sc = new Scanner(System.in);
         int pass;
         do { 
            System.out.print("Enter your password:");
            pass = sc.nextInt();
            } while (pass !=1234); 
            System.out.println("Your Device is Unlocked");
       
    }
}