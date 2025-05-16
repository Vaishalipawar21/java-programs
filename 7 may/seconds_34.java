
import java.util.*; 
class seconds_34
{ 
    public static void main(String arg[]) 
    { 
        int sec,hr,min; 
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter seconds:-"); 
        sec=sc.nextInt(); 
        hr=sec/3600; 
        int rem=sec%3600; 
        min=rem/60; 
        sec=rem%60; 
        System.out.println("hour="+hr); 
        System.out.println("min="+min); 
        System.out.println("sec="+sec); 
 
        System.out.println(hr+":"+min+":"+sec); 
    } 
} 
 
