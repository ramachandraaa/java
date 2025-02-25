package DSA.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class cons {
   public static void main(String[] args) {
    int[] arr=new int[]{1,0,1,1,0,0,1,1,1,0,0,1,1,0,0};
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
    ArrayList<Integer> list=new ArrayList<>();
   for(int j=0;j<n;j++)
   {
    list.add(count[j]);
   }
   int maxi=Collections.max(list);

    System.out.println(maxi);

    
   }
    
}
