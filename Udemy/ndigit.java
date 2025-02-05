package Udemy;

public class ndigit {
    public static void main(String[] args) {
        int n=145;
        int count=0;
        while(n>0)
        {
//int rem=n%10;
n=(int)n/10;
count++;
        }
        System.out.println(count);
        
    }
    
}
