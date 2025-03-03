package practice;
import java.util.Scanner;

public class ram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ram");
        ram s=new ram();
       s. get();
       int n=sc.nextInt();
    }

    
    
public void get() 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number: ");
    long n=sc.nextInt();
    System.out.println(n*n);
}

    
}

