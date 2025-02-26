package DSA.arrays;
//program to find the single elements 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class single {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,2,2,3,3,4,4,5,5,6};
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=1;
       int  n=arr.length;
       for(int k=0;k<n;k++)
       {
list.add(arr[k]);
       }
    list.add(143);
    Collections.sort(list);
        while(j<n+1)
        {
if(Objects.equals(list.get(i), list.get(j)))
{
    i=i+2;
    j=j+2;

}
else 
{
    System.out.println(list.get(i));
    break;
}
        }
        
    }
    
}
