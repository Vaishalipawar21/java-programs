import java.util.*; 
class Dollar_42 
{ 
    public static void main(String arg[]) 
    { 
        double dollar,rupees; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter amount in dollars($)"); 
        dollar=sc.nextDouble(); 
        rupees=85.43*dollar; 
        System.out.printf("dollar in rupees Rs %.2f%n",rupees); 
    } 
} 
