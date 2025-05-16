
import java.util.*; 
class Squ_13 
{ 
    public static void main(String arg[]) 
    { 
        double side; 
        double area,peri; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter side:"); 
        side=sc.nextDouble(); 
        area=side*side; 
        peri=4*side; 
        System.out.println("Area of square="+area); 
        System.out.println("perimeter of square="+peri); 
 
    } 
}