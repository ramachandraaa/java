package simple_sorting;

public class selsectsortrun {
    public static void main(String[] args) {
        selectsort sor=new selectsort(10);
        sor.insert(10);
        sor.insert(20);
        sor.insert(30);
        sor.insert(50);
        sor.insert(40);
        sor.display();
        sor.sort();
        sor.display();


    }
    
}