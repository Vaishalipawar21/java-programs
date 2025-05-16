// Write a program to read a 3-digit number and find whether the middle digit is numerically 
//equal to the sum of the other Two digits and prints an appropriate response? 

import java.util.Scanner;

public class digits21 
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your number:");
     int num = sc.nextInt();

     System.out.println("Number : " + num);
     int a = num % 10;
     num /=10;
     int b = num % 10;
     num /=10;
     int c= num % 10;

     System.out.println("a: " + a);
     System.out.println("b: " + b);
     System.out.println("c: " + c);
     if (a + c == b) {
        System.out.println("Condition Satishfied.");
        
      } else {
        System.out.println("Condition  not Satishfied.");
        
      

      }
     

     }
        
    }
