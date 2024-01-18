package control;

public q35. 
{
   public static void main(String[] args) 
   {
        int x=5;

        if(x>0 && x<=5)
        {
            System.out.println("Fine (in Rs.) = " + x*0.5);
        }
        else if(x>=6 && x<10)
        {
            System.out.println("Fine (in Rs.) = " + x*1);
        }
        else if(x>10 && x<=30)
        {
            System.out.println("Fine (in Rs.) = " + x*5);
        }
        else if(x>30)
        {
            System.out.println("Your membership will be cancelled");
        }
    
    String str= x>0 && x<=5 ? "Fine (in Rs.) = " + x*0.5 : x>=6 && x<10 ? "Fine (in Rs.) = " + x*1 : x>10 && x<=30 ? "Fine (in Rs.) = " + x*5 : "Your membership will be cancelled";
    System.out.println(str);
    }  
}
