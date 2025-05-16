
import java.util.*; 
class tri_19 
{ 
    public static void main(String arg[]) 
    { 
        double a,b,c; 
        double s, area; 
        Scanner sc=new Scanner(System.in); 
         System.out.println("enter first side:"); 
         a=sc.nextDouble(); 
         System.out.println("enter second side:"); 
         b=sc.nextDouble(); 
         System.out.println("enter third side:"); 
          c=sc.nextDouble(); 
         
        s=(a+b+c)/2; 
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
        System.out.println("Area of three side of triangle="+area); 
     
 
    } 
} 
 
