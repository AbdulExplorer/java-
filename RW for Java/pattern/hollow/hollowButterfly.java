package pattern.hollow;

import java.util.Scanner;

public class hollowButterfly 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(sys)
        int n=;

        for(int r=1; r<=n; r++)
        {
            for(int c=1; c<=n; c++)
            {
                if(r==c||r+c==n+1||r==1||r==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println();


         for(int r=1; r<=n; r++)
        {
            for(int c=1; c<=n; c++)
            {
                if(r==c||r+c==n+1||c==1||c==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
