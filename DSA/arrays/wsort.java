package DSA.arrays;
//this program is to check wheather the given array is sorted or not

public class wsort {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,50,40};
        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
if(arr[i]>arr[i+1])
{
    break;
}
        }
        if(i+1==arr.length)
        {
System.out.println("the array is sorted");
        }
       else{
        System.out.println("The array is not sorted");
       }

    }
    
}
