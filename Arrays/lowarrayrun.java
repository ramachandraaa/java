package Arrays;

public class lowarrayrun {
    public static void main(String[] args) {
        lowarray arr=new lowarray(100);
        for(int i=0;i<=10;i++)
        {
          arr.set(i,i);
         System.out.println(arr.get(i));
        }


    }
    
}
