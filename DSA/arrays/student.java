package DSA.arrays;

public class student {
   private  String name;
   private int [] marks= new int[100];
    int sum1;
 public student(String name,int... marks) 
    {
this.marks=marks;
this.name=name;
    }
    public void   sum()
    {
for(int i=0;i<marks.length;i++)
{
    sum1+=marks[i];
}
System.out.println(sum1);
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
    }
public void max()
{
    int max=0;
    for(int i=0;i<marks.length;i++)
    {
        if(marks[i]>max)
        {
            max=marks[i];
        }
    }
    System.out.println(max);
}
    
}
