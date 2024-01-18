package pattern.hollow;

public class plusAndX
{
public static void main(String[] args) 
{  
     int n=5;

for(int r=1; r<=n; r++)
{
    for(int c=1; c<=n; c++)
    {
      if(r==n-2||c==n-2)
        {
          if(r==r||c==c)
          System.out.print("+ ");
        }
      else
        {
         System.out.print("  ");
        }
    }
    System.out.println();
}

System.out.println();

for(int r=1; r<=n; r++)
{
    for(int c=1; c<=n; c++)
    {
        if(r==c||r+c==n+1)
        System.out.print("x ");
        else
        System.out.print("  ");
    }
    System.out.println();
}
}
}

