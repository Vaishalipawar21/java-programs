import java.util.*; 
class mili_31
{ 
    public static void main(String arg[]) 
    { 
        int l,ml; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter volume in mililiters"); 
        ml=sc.nextInt(); 
        l=ml/1000; 
        ml=ml%1000; 
        System.out.println(l+" liters "+ml+" ml"); 
    } 
} 
 

