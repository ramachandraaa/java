package DSA.arrays;

import java.util.HashMap;
//this is the Example of Hashmap

public class stsrt {
    public static void main(String[] args) {
    HashMap<Integer,String> map=new HashMap<>();
  map.put(3,"Ramc");
   map.put(1,"Ram");
   map.put(10,"Rama");
   map.put(2,"Ram");
   
  // map.put(3,"Ramc");

  // map.put(3,"Ramc");

   


   System.out.println(map.containsValue("Ram"));
   System.out.println(map.entrySet());
  // System.out.println(map.keySet());
   


   

}
}
