package DSA.arrays;
//this program shifts all Zeroes in the given array to the left

public class szero {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,0,6,0,5};
       int  n=arr.length;
        int i=0; int j=n-1;
       while(j>i)
       {
        if(arr[i]==0)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        i++;
       }
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
}
