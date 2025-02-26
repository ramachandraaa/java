package Udemy;

import java.util.List;

public class functrun {
    public static void main(String[] args) {
        List<String> list=List.of("Cat","Bat","Dog");
        printat(list);


        
    }
    private static void print(List<String> list)
    {
list.stream().forEach(
 element->  System.out.println(element)
    );
    }
    private static void printat(List<String> list)
    {
list.stream()
.filter(
    element->element.endsWith("at")
)
.forEach(
    
 element->  System.out.println(element)
    );
    }
    
    
}
