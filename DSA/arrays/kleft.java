package DSA.arrays;
//this program shifts the elements by kth bosition right or left

public class kleft {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int n=arr.length;
        int[] k=new int[10];
        int p=3;
        //int i=n-1;
        for(int l=0;l<p;l++)
        {
k[l]=arr[n-l-1];
        }
       for( int i=n-1;i>=p;i--)
       {
arr[i]=arr[i-p];
       }
       for(int m=0;m<p;m++)
       {
        arr[m]=k[m];
       // arr[1]=k[1];
       }
        for(int j=0;j<n;j++)
        {
        System.out.println(arr[j]);
        }
    }
    
}
