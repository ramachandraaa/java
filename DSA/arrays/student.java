package DSA.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class student {
   private  String name;
   ArrayList<Integer> arr =new ArrayList<Integer>();

   private int [] marks= new int[100];
    int sum1;
   // ArrayList arr new ArrayList();
 public student(String name,int... marks) 
    {
this.marks=marks;
this.name=name;
    }
 public   void addlist()
    {
        for (int i=0;i<marks.length;i++)
        {
            arr.add(marks[i]);
        }
    }
    public void   sum()
    {
for(int i=0;i<marks.length;i++)
{
    sum1+=marks[i];
}
System.out.println(sum1);
sum1=0;
//return sum1;
//System.out.println(marks.length);
    }
    public void avg()
    {
        sum1=0;
        for(int i=0;i<marks.length;i++)
       
{
    sum1+=marks[i];


}
float av=sum1/marks.length;
System.out.println(av);
sum1=0;
    }
public void max()
{
    int max=marks[0];
    for(int i=0;i<marks.length;i++)
    {
        if(marks[i]<max)
        {
            max=marks[i];
        }
    }
    System.out.println(max);
}
public void addmarks(int m)
{
arr.add(m);
System.out.println(arr);
int n;

marks = new int[arr.size()]; // Resize the array if necessary
n=marks.length;
for(int i=0;i<n;i++)
{
    marks[i]=arr.get(i);
    // System.out.println("Updated Array: " + Arrays.toString(marks));
}
System.out.println("Updated Array: " + Arrays.toString(marks));

}
    
}
