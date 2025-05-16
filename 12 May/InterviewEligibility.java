 //Accept 10th, 12th, and graduation marks, then check eligibility for an interview.
import java.util.Scanner;
public class InterviewEligibility
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for 10th (out of 100): ");
        double tenthMarks = scanner.nextDouble();
        
        System.out.print("Enter marks for 12th (out of 100): ");
        double twelfthMarks = scanner.nextDouble();
        
        System.out.print("Enter marks for Graduation (out of 100): ");
        double graduationMarks = scanner.nextDouble();
        // Check eligibility
        boolean isEligible = (tenthMarks >= 60) && (twelfthMarks >= 60) && (graduationMarks >= 50);
        // Display eligibility result
        if (isEligible) {
            System.out.println("You are eligible for the interview.");
        } else {
            System.out.println("You are not eligible for the interview.");
       

        }
      

        