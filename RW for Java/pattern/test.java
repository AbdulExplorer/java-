package pattern;

public class test 
{
    public static void main(String[] args) 
    {
        int n=5;
        int m=n/2;

    for(int r=1; r<=n; r++)
    {
        for(int c=1; c<=n; c++)
        {
          if(c==m+1||r==m+1||r==1&&c>m+1||c==1&&r<=m+1)
            {
              System.out.print("* ");
            }
          else
            {
             System.out.print("  ");
            }
        }
        System.out.println();
    }    
    }
    
}
