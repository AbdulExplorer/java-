package control;

public class q23 
{
    public static void main(String[] args) 
    {
        int x=2004 ,y=2003;
        if((x-y)>3)
        {
            System.out.println("Bonus of Rs. 2500 is given to employee");
        }
        else
        {
            System.out.println("There is a no bonus for employee.");
        }

    String str=(x-y)>3 ? "Bonus of Rs. 2500 is given to employee" : "There is a no bonus for employee.";
    System.out.println(str);

    }
}

