package DSA.arrays;


public class selectsort {
    public static void main(String[] args) {
        
    
    int[] a={12,2,4,3,1};
    int temp=0;
    int n=a.length;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        {
if(a[j]<a[j+1])
{
    temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
}
        }
    }
   // System.out.println(a[0]);
  
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
    
}
    
    }
}
