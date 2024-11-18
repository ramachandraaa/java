package Arrays;
//this program include the use of getters and setters 

public class lowarray {
    private int[] a;
   public lowarray(int size)
    {
        a=new int[size];

    }
    public void set(int index ,int value)
    {
        a[index]=value;
    }

   public int get(int index)
   {
    return a[index];
   }


}
