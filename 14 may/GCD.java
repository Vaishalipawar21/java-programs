import java.util.Scanner;
public class GCD 
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();

        int gcd = 1;
        int i = 1;
        while (i <=a || i < b) {
            if(a % i == 0 && b % i == 0 ){

            }
            i++;

        }
        System.out.println("GCD: + gcd");
        double lcm = (a * b) / gcd;
        System.out.println("LCM + lcm");

     }
    
}
