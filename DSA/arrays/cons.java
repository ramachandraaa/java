package DSA.arrays;

import java.util.Arrays;

public class cons {
   public static void main(String[] args) {
    int[] arr=new int[]{1,0,1,1,0,0,1,1,1,1,0,1,1,1,0};
    int i;
    int n=0;
    //int high=count[0];
    int count[] =new int[10];
    for( i=0;i<arr.length;i++)
    {
        if(arr[i]==1)
        {
            count[n]++;
        }
        else
        {
           n++;
        }
    }

    int max = Arrays.stream(count).max().orElseThrow();

    System.out.println(max);

    
   }
    
}
