
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secLargest {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
                int largest=list.get(0);

        for (int i=1;i<list.size();i++)
        {
            if (list.get(i)>largest)
            {
largest=list.get(i);
            }

        }
        list.remove(list.indexOf(largest));
        int secLarge=list.get(0);
         for (int i=1;i<list.size();i++)
        {
            if (list.get(i)>secLarge)
            {
secLarge=list.get(i);
            }

    }
    System.out.println(secLarge);
    
}
}