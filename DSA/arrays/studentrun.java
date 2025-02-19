package DSA.arrays;


public class studentrun {
    public static void main(String[] args) {
       // int[] marks={93,100,97,87,88};
     student s=new student("ram",93,87,100,94,88);
       s.sum();
       s.avg();
       s.max();
       s.addlist();
        s.addmarks(30);
        s.sum();
       s.avg();
       s.max();
       s.delete(5);
       // s.removeatindex(5);
    }
    
}
