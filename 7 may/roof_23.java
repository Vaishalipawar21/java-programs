
import java.util.*; 
class roof_23
{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter length of room"); 
        double l=sc.nextDouble(); 
         System.out.println("Enter breadth of room"); 
       double b=sc.nextDouble(); 
         System.out.println("Enter Height of room"); 
       double h=sc.nextDouble(); 
 
        System.out.println("Enter length and height of doors"); 
       double l_door=sc.nextDouble(); 
       double h_door=sc.nextDouble(); 
 
        System.out.println("Enter length and height of window"); 
       double l_window=sc.nextDouble(); 
       double h_window=sc.nextDouble(); 
 
       double total=2*(l+b)+2*(b+h)+2*(l+h); 
        System.out.println("total area of room="+total); 
 
       double total_door=l_door*h_door; 
        System.out.println("total area of door="+total_door); 
 
double total_window=l_window*h_window; 
System.out.println("total area of window="+total_window); 
double floor=l*b; 
double painted=total-(total_door+total_window+floor); 
System.out.println("total area to be painted "+painted); 
} 
}