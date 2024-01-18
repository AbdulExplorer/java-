package control;

public class q37 
{
  public static void main(String[] args) {
        int x=7;

        int count=0;
        while(x>0)
        {
            x=x/10;
            count++;
        }
        System.out.println("Total digit in number is : " + count);
    }  
}
