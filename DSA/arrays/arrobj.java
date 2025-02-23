package DSA.arrays;

public class arrobj {
   private String name;
   private int[] marks;
    public arrobj(String name,int... marks)
    {
this.marks=marks;
this.name=name;
    }
    public void display()
    {
        System.out.println("name:"+name );
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
    public int len()
    {
        return name.length();
    }
    //
    
}
