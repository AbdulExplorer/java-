package pattern.star;

public class starTri 
{
    public static void main(String[] args) 
    {
      int a,b,r=6;
      
      for(a=0; a<r; a++) // a=0; a<=n; r++
      {
        for(b=1; b<=(b-a)+r; b++)
        {
          System.out.print("*");
        }
         for(b=0; b<=r; b++)//b=1; b<=(r-a)+n; b++
        {
          System.out.print("* ");
        }
        System.out.println();
                
      }
    }
//     for(a=1; a<=r; a++)
//     {
//       for(b=1; b<r-a; b++)
//       {
//         System.out.print("s ");
//       }
//       for(b=1; b<=a; b++)
//       {
//         System.out.print("* ");
//       }
//     }
//     System.out.println();
// }
}
