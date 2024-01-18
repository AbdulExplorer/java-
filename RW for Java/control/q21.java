package control;

public class q21 
{
  public static void main(String[] args) 
  {
    int u=200;
    float bill,totalbill;
    if(u<=50)
    {
        bill=u*0.50f;
    }
    else if (u<=150)
    {
        bill=u*0.75f;
    }
    else if (u<=250)
    {
        bill=u*1.20f;
    }
    else
    {
        bill=u*1.50f;
    }
    totalbill=(bill*0.20f)+bill;
    System.out.println("total electricity bill "+totalbill+" Rs");

  }  
}
