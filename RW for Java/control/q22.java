package control;

public class q22 
{
    public static void main(String[] args) 
    {
      int q=12;
      float p=127;
      float e;
      e=p*q;

       if(q>=100)
       {
       e=e-(e*0.1f);
       System.out.println("discount applied "+e);
       }       
       else
       System.out.println("discount not applied "+e);        
    }    

}
