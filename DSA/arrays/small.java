package DSA.arrays;
//the Question is to find the Second largest element of an array

public class small {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,60,50};
    int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
if(arr[i]>large)
{
    large=arr[i];
    
}
        }
    
        int lar=0;
        for(int j=0;j<arr.length;j++)        
        {
if(arr[j]>lar&&arr[j]<large)
{
    lar=arr[j];

}
        }
        System.out.println("The Second Largest Element is: "+ lar);
        System.out.println("The  Largest Element is: "+ large);
    }
    
}
