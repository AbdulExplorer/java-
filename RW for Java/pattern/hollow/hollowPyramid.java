package pattern.hollow;

public class hollowPyramid 
{
  public static void main(String[] args)
  {
    int n=5;
    for(int r=1; r<=n; r++)
    {
      for(int c=6; c<=11; c++)
      {
        if(r+c==6||r+c==||c==n)
        System.out.print("* ");
        else
        System.out.print("  ");
      }
      System.out.println();
    }
  }  
}
