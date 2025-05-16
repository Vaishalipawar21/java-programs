import java.util.*; 
class centi_41 
{ 
public static void main(String arg[]) 
{ 
double dist, dist_meters,dist_centi; 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Distance between two cities in kilometers"); 
dist=sc.nextDouble(); 
dist_meters=dist*1000; 
dist_centi=dist*100000; 
System.out.println("distance between two cities in meters="+dist_meters); 
System.out.println("distance betn two cities in centimeters="+dist_centi); 
} 
} 
