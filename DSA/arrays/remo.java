package DSA.arrays;

import java.util.Arrays;

public class remo {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,20,60,50};
        int n=arr.length;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i+1])
             {  
            for(int j = i; j < n - 1; j++) {
                    arr[j] = arr[j+1]; 
                }
                n--;  
                //i--;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    

        
    }
    
}
