package Udemy;
import java.util.Scanner;
public class userin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        //System.out.println("Enter the Number:");
        //int n=sc.nextInt();
        do
        {
            System.out.println("Enter the Number:");
             n=sc.nextInt();
System.out.println("The number is :"+n);
//break;    
        }while(n>0);
    }
    
}
