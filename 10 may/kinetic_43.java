import java.util.*; 
class kinetic_43 
{ 
    public static void main(String arg[]) 
    { 
        double m,v,g,h,KE,PE; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter mass(m) of the object:"); 
        m=sc.nextDouble(); 
         System.out.println("enter velocity(v) of the object:"); 
        v=sc.nextDouble(); 
 
        KE=0.5*m*v*v; 
       
System.out.println("kinetic energy="+KE); 
System.out.println("enter mass(m) of the object:"); 
m=sc.nextDouble(); 
System.out.println("enter acceleration due to gravity (g):"); 
g=sc.nextDouble(); 
System.out.println("enter height of object(h):"); 
h=sc.nextDouble(); 
PE=m*g*h; 
System.out.println("potential energy="+PE); 
} 
} 
