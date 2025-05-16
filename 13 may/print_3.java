//Print numbers from 100 to 5000, incrementing by 50.

import java.util.Scanner;
 public class print_3
 
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your start:");
        int n = sc.nextInt();
       System.out.print("Enter your end:");
       int i = sc.nextInt();

        while (i <= n) {
            System.out.println("i:" + i);
            i+=50;
       }
 }
}
