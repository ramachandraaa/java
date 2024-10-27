public class Timecomplex {
    public static void main(String[] args)
    {
      Timecomplex n=new Timecomplex();
      System.out.println(n.sum(8));
    }
    public int sum(int n)
    {
        int sum=0;
     //   return n*(n+1)/2;//less time of compilation
        for(int i=0;i<n;i++)
        {
            sum+=i;

       }
return sum;
    }
hi

}
