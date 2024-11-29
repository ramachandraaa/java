package Arrays;
class twosum{
    private int[] a;
    private int n;
    public twosum(int size)
    {
        a=new int[10];
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
public int[] sum(int value)
{
    int i;int j;
   for( i=0;i<n;i++) 
   {
for(j=i+1;j<n;j++)
{
    if(a[i]+a[j]==value)
    return new int[]{i,j};
}
   }
   return null;
}
}