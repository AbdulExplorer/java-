package control;

public class q36 
{
   public static void main(String[] args) 
   {
    int x=8 ,y=9 ,z=5;

        if(x==y && y==z && x==z)
        {
            System.out.println(x+" " + y + " and " + z + " are equal.");
        }
        else 
        {
            System.out.println(x + y + " and " + z + " are not equal.");
        }
    
        String str= x==y && y==z && x==z ? x +" "+ y + " and " + z + " are equal." : x + y + " and " + z + " are not equal.";
        System.out.println(str);
    }  
}
