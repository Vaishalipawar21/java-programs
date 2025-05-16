import java.util.*; 
class Dist_39 
{ 
    public static void main(String arg[]) 
    { 
        int x1,x2,y1,y2,dist; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the distance of x1,y1"); 
        x1=sc.nextInt(); 
        y1=sc.nextInt(); 
 
        System.out.println("Enter the distance of x2, y2"); 
        x2=sc.nextInt(); 
        y2=sc.nextInt(); 
 
        dist=(x2-x1)+(y2-y1); 
        System.out.println("Distance between two points="+dist); 
 
    } 
}
