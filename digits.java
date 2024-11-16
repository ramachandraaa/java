public class digits {
    public static void main(String[] args) {
    digits d=new digits();
   System.err.println(d.digitcalc(100));
        
    }
    public int digitcalc(int num)
    {
        int n=0;
if(num>=0)
{
    while(num!=0)
    {
    num=(int)num/10;
    n++;
    }
    return n;

    
}
 return -1;   }
    
}
