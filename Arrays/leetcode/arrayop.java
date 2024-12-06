package Arrays.leetcode;
public class arrayop {
    public static void main(String[] args) {
        int [] a={10,20,20,30,40,40};
        int n=a.length;
        int i=0; int j=1;
        while(j > i && j < a.length)
        {
            if(a[i]==a[j])
            {
                a[i]=2*a[i];
                a[j]=0;
            }
            i++;
            j++;
        }
       
        int temp;
        int x=0;
        int y=n-1;
        while(y>x)
        {
        for(x=0;x<n;x++)
        {
            if(a[y]==0)
            {
                y--;
            }
            if(a[x]==0)
            {
                temp=a[x];
                a[x]=a[y];
                a[y]=temp;
                y--;
            }
        }
    }
        for(int k=0;k<n;k++)
        {
            System.out.println(a[k]);
        }
    }
    
}
