import java.util.*; 
class Swap_26 
{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter first number:"); 
        int n1=sc.nextInt(); 
        System.out.println("Enter second number:"); 
        int n2=sc.nextInt(); 
        n1=n1+n2; 
        n2=n1-n2; 
        n1=n1-n2; 
        System.out.println("Swapping of two numbers="); 
        System.out.println("First number="+n1); 
        System.out.println("second number="+n2); 
 
    } 
} 
