import java.util.Scanner;
public class randomno
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = (int) Math.floor(Math.random()*100)+1;
        int count = 0;
        int guess;
        do { 
            System.out.print("Guess the number:");
            guess = sc.nextInt();
            if(num != guess){
              if(guess > num)
              {
               System.out.println("Enter Small:" +guess);
              
              } else if (guess < num) {
                System.out.println("Enter large:" +guess);

           }  
                            
    }
    count++;
    } while (num != guess);
    System.out.println("You Win in"+count+" Tries");

   }
    
}


