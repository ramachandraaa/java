  public class higharray {
    private int[] a;
    private int n;
    public static void main(String[] args) {
        higharray arr=new higharray(300);
      arr.insert(10);
      System.out.println(arr.find(20));
        
    }

    
    

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
    

}
