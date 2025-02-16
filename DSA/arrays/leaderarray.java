package DSA.arrays;
import java.util.Scanner;
public class leaderarray {
    public static void main(String[] args) {
        int [] a=new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter N");
int n=sc.nextInt();
//sc.close();
System.out.println("Enter the Numbers:");
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();    
  
}   
sc.close();
int i=0;
//int j=n-1;
for(i=0;i<n;i++)
{
    int j=n-1;
while(j>i)
{
    if(a[i] <= a[j])
    {
        break;
    }
    if(a[i]>a[j])
    {
        j--;
        continue;
    }
    

}
if(j==i)
{
    System.out.println(a[i]);
}
}

    }

}