package DSA.arrays;
//this is the duch national flag algorithium

public class duch {
    public static void main(String[] args) {
        int [] a={0,1,2,0,2,1,2,0};
       int  n=a.length;
     
        int l=0; int m=0; int h=n-1;
        while(m<=h)
        {

            if(a[m]==0)
            {
                int temp=a[m];
        // temp=a[m];
                a[m]=a[l];
                a[l]=temp;
                l++;
                m++;
            }
         else   if(a[m]==1)
            {
                m++;
            }
           else if(a[m]==2)
            {
                int temp=a[m];
               // temp=a[m];
                a[m]=a[h];
                a[h]=temp;
                h--; 
            }


        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
            
        }
    }
    
    

