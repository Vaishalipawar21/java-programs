        import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        // Calculate total and percentage
        int total = subject1 + subject2 + subject3;
        double percentage = (total / 3.0);
        // Determine class based on percentage
        String classDivision;
        if (percentage >= 60) {
            classDivision = "First Class";
        } else if (percentage >= 50) {
            classDivision = "Second Class";
        } else if (percentage >= 40) {
            classDivision = "Third Class";
        } else {
            classDivision = "Fail";
        }
        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Class: " + classDivision);
        // Close the scanner
        scanner.close();
    }
}