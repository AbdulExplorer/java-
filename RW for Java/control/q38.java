package control;

public class q38 
{
  public static void main(String[] args) 
  {
    int x=5,y=4,z=2;

        if(x>y && y>z)
        {
            System.out.println("Increasing order");
        }
        else if(x<y && y<z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Not in any order");
        }

    String str=x>y && y>z ? "Increasing order" : x<y && y<z ? "Decreasing order" : "Not in any order";
    System.out.println(str);

    }  
}
