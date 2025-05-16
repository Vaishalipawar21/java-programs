import java.util.*; 
 
public class Ring_47  
{ 
 
    public static void main(String[] args) 
     { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter the outer radius of the ring: "); 
        double r1 = scanner.nextDouble(); 
 
        System.out.print("Enter the inner radius of the ring: "); 
        double r2= scanner.nextDouble(); 
 
       double area= 3.14 * (r1*r1 - r2*r2); 
         double peri= 2 * 3.14 * (r1+r2); 
 
        System.out.printf("Area of the ring:%.2f%n ",area); 
        System.out.printf("Perimeter of the ring: %.2f%n", peri); 
 
      
    } 
} 
