package DSA.arrays;

public class arrobjrun {
    public static void main(String[] args) {

        arrobj[] arr=new arrobj[10];
        arr[0]=new arrobj("Rama",100,99,98,97);
        arr[1]=new arrobj("Ramac",100,99,98,97);
        int big=0;
for(int i=0;i<2;i++)
{
    if(arr[i] != null && arr[i+1] != null && arr[i].len() > arr[i+1].len())
    {
       big=arr[0].len();
       break;
    }
    big =arr[1].len();

}
System.out.println(big);
        arr[0].display();
      //  System.out.println(arr[0].len());
    }
    
}
