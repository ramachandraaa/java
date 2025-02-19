package DSA.arrays;

public class longstringb {
    String[] str=new String[10];
  public  longstringb(String... str)
    {
      this.str= str;
    }
  public  void display()
    {
    
      for(int i=0;i<str.length;i++)
      {
System.out.println(str[i]);
      }
    }
    public void lo()
    {
      String large=str[0];
      for(int i=1;i<str.length;i++)
      {
      if( str[i].length()>large.length())
      {
large=str[i];
break;
      }
      }
      System.out.println("The Largest String is: "+ large);
    }
}
