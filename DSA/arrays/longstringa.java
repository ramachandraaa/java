package DSA.arrays;
import java.util.ArrayList;

public class longstringa {
  private  String[] str=new String[10];
  ArrayList<String> ar=new ArrayList<String>();
  public longstringa(String...str )
  {
this.str=str;
  }
  public void  larg()
  {
     
    for(int i=0;i<str.length;i++)
    {
       ar.add(str[i]);
    }
    

  }

    
}
