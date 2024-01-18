package pattern.hollow;

public class hollowTri
{
  public static void main(String[] args) 
  {

    int r, c, n=5;

    for(r=1; r<=n; r++)
    {
        for(c=1; c<=r; c++)
        {
            if(r==n||c==r||c==1||c==n)
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


    System.out.println();

    
    for(r=1; r<=n; r++)
    {
        for(c=1; c<=n; c++)
        {
            if(c==n|| r==n|| r+c==n+1)
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
