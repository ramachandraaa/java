package Udemy;

public class prime {
    public static void main(String[] args) {
        int n=6;
        for(int i=2;i<n-1;i++)
        {
            if(n%i==0)
            {
System.out.println("The given number is prime");

            }
            else{
            System.out.println("The given number is not prime!!");
            }
            break;
        }
        //System.out.println("The given number is not prime!!");
    }
    
}
