//Print first n even numbers.

import java.util.Scanner;
 public class sum_9
 
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your start:");
        int i = sc.nextInt();
       System.out.print("Enter your end:");
       int n = sc.nextInt();
       int sum = 0;
        while (i <= n) {
            sum += 1;
            i++;
            
       }
       System.out.print("Sum:"+ sum);
 }
}
