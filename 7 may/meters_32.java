import java.util.*; 
class meters_32 
{ 
    public static void main(String arg[]) 
    { 
        int m,km; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter distance in meters "); 
        m=sc.nextInt(); 
 
        km=m/1000; 
        m=m%1000; 
 
 
        System.out.println(km+" kilometers "+m+" meters "); 
    } 
} 
 
