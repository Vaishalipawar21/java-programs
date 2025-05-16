
import java.util.*; 
class bitwise_27

{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter first number:");  
        int n1=sc.nextInt();  //n1=5 
        System.out.println("Enter second number:"); 
        int n2=sc.nextInt();  //n2=10 
        n1=n1^n2;       //n1=n1^n2->n1=15 
        n2=n1^n2;       //n2=n1^n2->n2=5 
        n1=n1^n2;       //n1=n1^n2->n1=10 
        System.out.println("Swapping of two numbers without using third 
variable="); 
        System.out.println("First number="+n1);     //10 
        System.out.println("second number="+n2);    //5 
 
    } 
} 