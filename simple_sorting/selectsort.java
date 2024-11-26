package simple_sorting;

public class selectsort {
    private int[] a;
    private int n;
    public selectsort(int size)
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
    int i;
    int j;
    int temp;
    int minele;
    for(i=0;i<n;i++)
    {
minele=i;
for(j=i+1;j<n;j++)
{
    if(a[j]<a[minele])
    {
        minele=j;
    }
}
temp=a[i];
a[i]=a[minele];
a[minele]=temp;
    }
}

    
}
