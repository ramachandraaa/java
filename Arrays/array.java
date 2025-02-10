package Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //int a[]=new int[10];
        int n=10;
      int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
       for(int i=0;i<n;i++)
       {
        System.out.println(a[i]);
       }
        //linear searchimg of the Element
     System.out.println("Ente the number to be scerched");
     int key=scanner.nextInt();
      for(int j=0;j<n;j++)
      {
        if(key==a[j])
        {
            System.out.println("The key is found at pos: "+(j+1));
           System.exit(0);
        
      }
    }
    System.out.println("The element not found");
    
    }
}
