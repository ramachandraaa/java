package Arrays;





public class twosumrun {
   public static void main(String[] args) {
      twosum sor=new twosum(10);
      sor.insert(10);
        sor.insert(20);
        sor.insert(30);
        sor.insert(50);
        sor.insert(40);
        sor.display();
        int[] result = sor.sum(90);  // Look for a pair that sums to 9
        
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
   }

     
       
    
}

