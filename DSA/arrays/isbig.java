package DSA.arrays;
//int[] arr=new int[10];

public class isbig {
    int[] arr=new int[10];
    public isbig(int... arr)
    {
this.arr=arr;
    }
public boolean  big(int number)
{
    for(int i=0;i<arr.length;i++)
    {
if(arr[i]>number)
{
    return true;
//System.out.println("There Exists the Element: "+arr[i]+" Which is greater");

}



    }
    return false;
    //System.out.println("There Exists no Element:!");

    

}

}
