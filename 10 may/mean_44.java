import java.util.*; 
class mean_44 
{ 
    public static void main(String arg[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int i; 
        System.out.println("enter limit:"); 
        int n=sc.nextInt(); 
         double[] a = new double[n]; 
        System.out.println("enter n numbers:"); 
        for(i=0;i<n;i++) 
        { 
            a[i]=sc.nextDouble(); 
        } 
         int sum = 0; 
        for (double num : a) { 
            sum += num; 
        } 
        double AM=sum/n; 
        System.out.println("Arithmetic mean="+AM); 
 
        double reciprocalSum = 0; 
        for (double num : a) { 
            reciprocalSum += 1 / num; 
        } 
        double HM=n/reciprocalSum ; 
         System.out.printf("Harmonic mean= %.2f%n",HM); 
         
 
         
    } 
}
