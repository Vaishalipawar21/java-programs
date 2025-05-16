
import java.util.Scanner;
public class reverse4
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        System.out.println("Original Number:" + num);
         
        while (n > 0);
          int digit = n % 10;
          rev = (rev * 10) + digit;
          n /= 10;

       }
       System.out.println("Reverse Number:" + rev);

        } 

  } 


       
