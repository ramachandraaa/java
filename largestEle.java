public class largestEle {
    public static void main(String[] args) {
        int [] num =new  int[] {1,2,30,4,5};
        int n=num.length;
        int ele=num[0];
       // System.out.println(n);
       for (int i=1;i<n;i++)
       {
        if (num[i]>ele)
        {
           ele=num[i];
        }
       }
       System.out.println("The Biggest Number is: "+ele);
    }
    
}
