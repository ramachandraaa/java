package Arrays;

public class higharrayrun {
  static int[] b=new int[10];
    public static void main(String[] args) {
        higharray arr=new higharray(100);
        
arr.insert(20);
        arr.insert(19);
        arr.insert(18);
        arr.insert(11);
      System.out.println(arr.find(10));
      int maxele;
      //System.out.println(arr.max());
     // arr.removemax();

     for(int i = 0; i < 10; i++) {
      maxele = arr.max();  
      b[i] = maxele;      
      arr.removemax();     
  }
  
      //arr.delete(14);
     //arr.display();
  for(int j=0;j<10;j++)
  {
System.out.println(b[j]);
  }

  }
        
    }

    

