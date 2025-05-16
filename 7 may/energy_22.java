
import java.util.*; 
class energy_22
{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter mass of particle:"); 
        double m=sc.nextDouble(); 
         System.out.println("enterAcceleration due to gravity:"); 
        double g=sc.nextDouble(); 
         System.out.println("enter height of particle:"); 
        double h=sc.nextDouble(); 
         System.out.println("enter velocity of particle:"); 
        double v=sc.nextDouble(); 
        double me=m*g*h+(1/2)*m*v*v; 
        System.out.println("mechanical Energy="+me); 
 
    } 
} 