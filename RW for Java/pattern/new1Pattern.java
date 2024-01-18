package pattern;

public class new1Pattern 
{
    public static void main(String[] args) 
    {
      int r=5;
      
      for(int x=1, p=1 ; x<=r; x++, p++)
      {
        for(int y=1; y<=r-x; y++)
        {
          System.out.print("  ");
        }
        for(int z=1; z<=2*x-1; z++)
        {
            System.out.print(p+" ");
        }
        System.out.println();
      }
    }  
}
