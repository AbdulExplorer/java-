package pattern.combinetions;

public class butterfly 
{
    public static void main(String[] args) 
    {
       for(int r=1; r<=4; r++)
       {
        for(int x=1; x<=r; x++)
        {
            System.out.print("* ");
        }
        for(int s=4; s>=r; s--)
        {
            System.out.print("  ");
        }
        for(int h=3; h>=r; h--)
        {
            System.out.print("  ");
        }
        for(int x=1; x<=r; x++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }

       for(int a=1; a<=9; a++)
       {
        System.out.print("* ");
       }
       System.out.println();

        for(int r=1; r<=4; r++)
       {
        for(int x=4; x>=r; x--)
        {
            System.out.print("* ");
        }
        for(int s=1; s<=r; s++)
        {
            System.out.print("  ");
        }
        for(int h=2; h<=r; h++)
        {
            System.out.print("  ");
        } 
         for(int x=4; x>=r; x--)
        {
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}    
