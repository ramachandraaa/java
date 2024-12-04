package Arrays.leetcode;
public class multiplenum {
    public static void main(String[] args) {
        int []a={10,10,20,30,40,10};
        int n=a.length;
       // for (int i = 0; i < n; i++) {
         //   System.out.println(a[i]);

         for(int i=0;i<n;i++)  
         {
            for(int j=i+1;j<n-1;j++)
            {
        if(a[i]==a[j])
{
    for(int k=j;k<n-1;k++)
    {
a[k]=a[k+1];

    }
    n--;
}

            }
            
           
         } 
        n--;
        
         for (int i = 0; i < n; i++) {
           System.out.println(a[i]);
         }

    }
    
}
