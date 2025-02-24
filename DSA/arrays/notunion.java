package DSA.arrays;
//this program is to find the union of the given array

public class notunion {
    public static void main(String[] args) {
        
    
    int[] arr=new int[]{1,3,5,6,7,8};
    int[]arr1=new int[]{1,2,3,4,5,6};
    int temp[]=new int[10];
    int k=0;
  int  n=Math.max(arr.length,arr1.length);
  for(int i=0;i<n;i++)
  {
for(int j=0;j<n;j++)
{
    if(arr[i]==arr1[j])
    {
        temp[k]=arr[i];
        k++;
    }
}
  }
  for(int m=0;m<k;m++)
  {
    System.out.println(temp[m]);
  }

}
}
