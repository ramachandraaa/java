package simple_sorting;
public class insertsort {
        private int[] a;
        private int n;
        public insertsort(int size)
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
for (int i = 0; i < n; i++) {
    int key=a[i];
    int j=i-1;
    while(j>=0&&a[j]>key)
    {
        a[j+1]=a[j];
        j--;
    }
    a[j+1]=key;
}
}
    
}
