package Udemy;

import java.util.List;

public class fuctint {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,3,4,5,6,7,8,9);
        print(list);
    
    }
    private static void print(List<Integer> list){
        list.stream().filter(Element->Element%2==0).forEach(Element-> System.out.println(Element));

    
}
}
