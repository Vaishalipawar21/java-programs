
import java.util.*; 
class stud_20 
{ 
    public static void main(String arg[]) 
    { 
    Scanner sc=new Scanner(System.in); 
        System.out.println("enter 5 subject marks(out of 100):"); 
       int s1=sc.nextInt(); 
       int s2=sc.nextInt(); 
       int s3=sc.nextInt(); 
       int s4=sc.nextInt(); 
       int s5=sc.nextInt(); 
 
      int total=s1+s2+s3+s4+s5; 
      double p=total/5; 
 
      System.out.println("total="+total); 
      System.out.println("percentage="+p); 
      if(p>70) 
      { 
        System.out.println("first class"); 
 
      } 
     else  if(p>50) 
      { 
        System.out.println("second class"); 
         
      } 
     else  if(p>35) 
      { 
        System.out.println("pass"); 
         
      } 
      else{ 
        System.out.println("fail"); 
      } 
 
} 
}