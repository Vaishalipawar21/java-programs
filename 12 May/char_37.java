import java.util.Scanner;

public class char_37
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Character:");
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'o' || ch =='u')
            System.out.println("It is Vowel");
           


}
          else
           {
                System.out.println("It is not Vowel");
            

              }
            } 
        
    }



