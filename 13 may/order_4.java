import java.util.Scanner;
 public class order_4
 
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
            i--;
       }
 }
}
