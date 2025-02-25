package DSA.arrays;
import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        int[] arr2=new int[10];
        System.out.println("Enter the array:");
        for(int j=0;j<n-1;j++)
        {
arr2[j]=sc.nextInt();
        }
        //int n=arr2.length;
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9,10,0};
        //int[] arr2=new int[]{1,2,3,4,5,6,7,8,9,10};
       // int n=arr2.length;
        int i;
        for( i=0;i<n;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                break;
            }
        }
        if(arr1[i]==0)
        {
            System.out.println("There is no missing ELE!!");
        }
        else{
        System.out.println("The missing no is: "+arr1[i]);
    }

    }
    
}
