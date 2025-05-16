
import java.util.*; 
class hms_30 
{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter time in H:M:S format(eg.10:20:44)"); 
        String time=sc.nextLine(); 
        String[] parts=time.split(":"); 
        int hours=Integer.parseInt(parts[0]); 
        int min=Integer.parseInt(parts[1]); 
 
         
int sec=Integer.parseInt(parts[2]); 
         sec=hours*3600+min*60+sec; 
        System.out.println("seconds="+sec); 
 
    } 
 
}