import java.util.Scanner;
public class leap year_3 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        
        if(scanner.hasNextInt()) {
            int year = scanner.nextInt();
            boolean isLeap = false;
            
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                isLeap = true;
            }
            
            if(isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer year.");
        }
        scanner.close();
    }
}
