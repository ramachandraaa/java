package DSA.arrays;
import java.util.Scanner;

public class delete {
    Scanner sc=new Scanner(System.in);
    int [] a=new int[100];
    int n;

 // int n;
    void array()
    {
    System.out.println("Enter the N:");
    n=sc.nextInt();
        System.out.println("Enter Values:");
       // System.out.println("Enter the N:");
for(int i=0;i<n;i++)
{
  a[i]= sc.nextInt();

}
    }
    void del(int key)
    {
        //int n=a.length;
        int i;
for( i=0;i<n;i++)
{
if(a[i]==key)
{
    System.out.println("The Element found at:"+i);
    break;
}

    
    }
    for(int j=i;j<n-1;j++)
    {
        a[j]=a[j+1];
    }
n--;
    
}
void insert(int ele,int pos)
{
    n++;
    for(int j=pos;j<n;j++)
    {
        a[j+1]=a[j];
        
    }
    //n++;
    a[pos]=ele;
    
    
}


void display()
{
    for(int j=0;j<n;j++)
    {
        System.out.println(a[j]);
    }
}
}

