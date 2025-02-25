package DSA.arrays;
import java.util.ArrayList;
import java.util.HashMap;
//import javax.lang.model.util.AbstractTypeVisitor14;

public class union {
    public static void main(String[] args) {
        
    
    int[] arr1=new int[]{1,2,3,5,7,8,11};
    int[] arr2=new int[]{1,3,5,7,9,10};
    ArrayList<Integer>list=new ArrayList<Integer>();
    HashMap<Integer,String>map=new HashMap<>();
    //int   n=arr1.length+arr2.length;
    for (int i = 0; i < arr1.length; i++) {
        list.add(arr1[i]);


        
    }
    for(int j=0;j<arr2.length;j++)
    {
        list.add(arr2[j]);   
    }
for(int k=0;k<list.size();k++)
{
    map.put(list.get(k),"RAM");

}
System.out.println(map.keySet());


    



    
    
    }
    
}
