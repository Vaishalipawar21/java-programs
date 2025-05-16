
import java.util.*; 
class Cal_21 
{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Princple Amount:"); 
        double P=sc.nextDouble(); 
        System.out.println("enter interest Rate:"); 
        double R=sc.nextDouble(); 
        System.out.println("Enter Time"); 
        double T=sc.nextDouble(); 
        double SI=(P*R*T)/100; 
        System.out.println("Simple Interest="+SI); 
        double CI=P*(Math.pow((1+R/100),T))-P; 
        System.out.println("compund interest="+CI); 
    } 
}