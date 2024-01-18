package control;

public class q29 
{
  public static void main(String[] args) 
  {
        int ram=24;
        int shyam=15;
        int ajay=20;

        if(ram<shyam && ram<ajay)
        {
            System.out.println("Ram is youngest");
        }
        else if(shyam<ram && shyam<ajay)
        {
            System.out.println("Shyam is youngest");
        }
        else 
        {
            System.out.println("Ajay is youngest");
        }
    }  
}
