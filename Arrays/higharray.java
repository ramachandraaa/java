package Arrays;
  public class higharray {
    private int[] a;
    private int n;
    private int maxvalue;
    
    public higharray(int size) {

        a=new int[size];
        n=0;
    }
    public void insert(int value)
    {
        a[n]=value;
        n++;
    }
    public boolean find (int key)
    {
        int i;
     for( i=0;i<n;i++)
     {
        if(a[i]==key)
        {
            break;
        }

     }
     if(n==i)
     {
        return false;
     }
     else
     return true;
    }
    public boolean delete(int value)
    {
        int i;
        for( i=0;i<n;i++)
        {
           if(a[i]==value)
           {
               break;
           }
   
        }
        if(n==i)
        {
           return false;
           

           } 
          else
        {
            for(int k=i;k<n;k++)
            {
                a[k]=a[k+1];
             n=n-1;
            }
          return true;
    }}
    public int max()
    {
        int k;
       // int maxvalue;
        maxvalue=a[0];
        
for(k=1;k<n;k++)
{
    if(a[k]>maxvalue)
    {
    maxvalue=a[k];
    
    }
}
return maxvalue;
    }
 public void removemax()
 {
    for(int i=0;i<n;i++)
    {
        if(a[i]==maxvalue)
        {
            a[i]=a[i+1];
            n--;
        }
    }
 }

    public void display()
    {
        for (int i = 0; i < n; i++) {

            System.out.println(a[i]);
        }
        
    }

}
