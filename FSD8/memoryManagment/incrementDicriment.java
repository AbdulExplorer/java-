package memoryManagment;

//decrement (post/pre)
//increment (post/pre)

public class incrementDicriment
{

  public static void main(String[] args)
  {
    int x=5;
    int a=6,b=2;
    //int c=7,d=8;
    //int e=5,f=6;
    
    System.out.println(x++); //increment (post)
    //System.out.println(x);
    //System.out.println(a++ +b++ +a+b);
    //System.out.println(e+f++ +f+e+e++ +e+f++ +f);

    System.out.println(++a); //incremint (pre)
    System.out.println(--b+b);
  }  
}
