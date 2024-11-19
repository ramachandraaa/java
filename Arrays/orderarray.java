package Arrays;

public class orderarray {
    public static void main(String[] args) {
        
        orderarray arr=new orderarray(100);
        arr.insert(10);
        arr.insert(100);
        arr.insert(100);
        arr.insert(100);
    System.out.println(arr.find(10));
        arr.display();
    }
    private int[] a;
    private int n;
    public orderarray(int size)
    {
a=new int[size];
n=0;
    }
    
    public int  find(int value)
    {
        int b=0;
        int mid;
        int e=n-1;
        while(true)
        {
          mid=(b+e)/2;
          if(a[mid]==value)
          {
            return mid;
          }
          if(a[mid]<value)
          {
         
         b=mid+1;
          }
          else 
          e=mid-1;
          
        }
       
       


    }
    public void insert(int value)
    {
        int i;
    for( i=0;i<n;i++)
    {
        if(a[i]>value)
        break;
    }
    for(int j=n;j>i;j--)
    {
        a[j]=a[j-1];
        
    }
    n++;
    a[i]=value;

    
    }
    public void display()
    {
        for (int k = 0; k < n; k++) {
            System.out.println(a[k]);
            
        }
    }


    
}
