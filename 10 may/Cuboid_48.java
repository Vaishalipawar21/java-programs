import java.util.*; 
 
public class Cuboid_48 
{ 
 public static void main(String[] args) 
 
     { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter the length: "); 
        double l = scanner.nextDouble(); 
 
        System.out.print("Enter the width: "); 
        double b= scanner.nextDouble(); 
 
         System.out.print("Enter the height: "); 
        double h= scanner.nextDouble(); 
 
      double surface_area=2*(l*b+b*h+l*h); 
 
        System.out.printf("surface Area of cuboid:%.2f%n ",surface_area); 
        
 
      
    } 
} 
 
