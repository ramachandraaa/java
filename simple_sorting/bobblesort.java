package simple_sorting;

public class bobblesort {
    private int[] a;
    private int n;
    public bobblesort(int size)
    {
        a=new int[size];
        n=0;
    }

    public void insert(int value)
{
    a[n]=value;
    n++;
}
public void display()
{
    for(int i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
}
public void sort()
{
    int temp;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
            }
        }
    }
}
}
