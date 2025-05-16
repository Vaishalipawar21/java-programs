import java.util.*; 
class rev_35 
{ 
    public static void main(String arg[]) 
    { 
       int num; 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter four digit number"); 
        num=sc.nextInt(); 
 
        int rev=0; 
        while(num!=0)   // joprynt num 0 hot nahi toprynt execute hoil 
        { 
        int digit=num%10; // last digit bhetato e.g:-1234%10=4 
        rev= rev*10+digit;// 0*10+4=4 
        num=num/10;         // 1234/10=123 
        } 
 
        System.out.println("reverse="+rev); 
    } 
} 
 
 
