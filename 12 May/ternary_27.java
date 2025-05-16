import java.util.Scanner;


public class ternary_27
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        int max=(a > b)? (a>c)? a:c : (b>c)? b:c;
       
        System.out.println("Max element is " + max);

    }
}
