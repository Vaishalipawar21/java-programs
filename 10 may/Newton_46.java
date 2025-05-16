import java.util.Scanner; 
 
public class Newton_46 
{ 
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter initial velocity (u) in m/s: ");   
        double u = scanner.nextDouble();        // Input initial velocity 
 
        
        System.out.print("Enter acceleration (a) in m/s²: "); 
        double a = scanner.nextDouble();     // Input acceleration 
 
        
        System.out.print("Enter time (t) in seconds: "); 
        double t = scanner.nextDouble();     // Input time 
 
        double v = u + a * t; 
        double s = u * t + 0.5 * a * t * t; 
   
        System.out.printf("Final Velocity (v) = %.2f m/s%n", v); 
        System.out.printf("Distance (s) = %.2f meters%n", s); 
 
         
    } 
}
