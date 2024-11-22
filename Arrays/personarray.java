package Arrays;

public class personarray {
    private person[] a;
    public personarray(int size)

   {
   a=new person [size];
   }
    
    private int n;
    public void insert(int age,String first,String last)
    {
        a[n]=new person(age,first,last);
        n++;
    }

public person find(String name )
{
    int i;
 for( i=0;i<n;i++)
 {
   if( a[i].getlast().equals(name))
   {
      break;
   }
 }
if(i==n)
{
    return null;
}
else 
return a[i];
}
    

public boolean delete(String last)
{

int j;

for(j=0;j<n;j++)
{
 if(a[j].getlast().equals(last))
 {
    break;
 }
}
 if(j==n)
 {
    return false;
 }else
 {
    for(int k=n;k>j;k--)
    {
        a[j]=a[j+1];
        n--;
    }
    return true;
 }
 
 

}
}
