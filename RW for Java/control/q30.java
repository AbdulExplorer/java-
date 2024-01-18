package control;

public class q30 
{
  public static void main(String[] args) 
  {
        int x=60;
        int y=50;
        int z=70;

        if(x+y+z==180)
        {
            System.out.println("It is a valid traingle.");
        }
        else
        {
            System.out.println("It is not a valid traingle.");
        }

    String ans=x+y+z==180 ?"It is a valid traingle" : "It is not a valid traingle";
    System.out.println(ans);
    }  
}
