
import java.util.Scanner;
 public class range_17
 
 
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number:");
        int n = sc.nextInt();
       
          System.out.print("Enter your character:");
           char ch = sc.next().charAt(0);

           int start = (int) ch;
           int end = start + n;

           while (start <= end) {
           System.out.println((char)start);
           start++;
           }
       
            
       }
 }


