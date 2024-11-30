package Arrays.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class maxarea {
       public static void main(String[] args) {
int[]a={1,8,6,2,5,4,8,3,7};
int n=a.length;
ArrayList<Integer>list=new ArrayList<>();
int i=0;
int j=n-1;
int area;
while(i<j)
{
    
    if(a[i]<a[j])
    {
        area=(j-i)*a[i];
        list.add(area);
        i++;
    }
    if(a[j]<a[i])
    {
        area=(j-i)*a[j];
        list.add(area);
        j--;
    }
    else { // Case where a[i] == a[j]
        area = (j - i) * a[i];
        list.add(area);
        i++;
        j--;

//System.out.println("\nAreas stored in list:");
      //  for (int val : list) {
       //     System.out.println(val);
        //}
int maxele=Collections.max(list);
System.out.println(maxele);

        
    }
    
}
       }
    }
