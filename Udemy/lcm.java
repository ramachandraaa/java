package Udemy;

public class lcm {
    public static void main(String[] args) {
        int n=4; int m=5;
      // int count=0;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<m;j++)
            {
                if((n*i)==(m*j))
                {
                    System.out.println(n*i);
                    break;
                }

            }
        }
    }
}
