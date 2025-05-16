
import java.util.Scanner;

public class Demo01
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Loan Amt:");
        double loan = sc.nextDouble();

        System.out.print("Enter duration:");
        int duration = sc.nextInt();

        double interest = loan * 0.1;

        double EMI = (loan + interest) / duration;
        
        System.out.println("interest:" + interest +"Rs.");
         System.out.println("EMI:" + EMI + "Rs.");
    }
}