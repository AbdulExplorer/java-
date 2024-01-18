public class ObjectP 
{
    String state; // instence variable 
    String capital;

    ObjectP(String x,String y) // object create ( parameter)
    {
        state = x; 
        capital = y;
    }
    public static void main(String[] args) 

    {

        ObjectP A = new ObjectP( "MP","bhopal");   // object call ( argument)
        ObjectP B = new ObjectP( "UP","lucknow");  // object call ( argument)

        System.out.println(A.state);
        System.out.println(A.capital);
        System.out.println(B.state);
        System.out.println(B.capital);

    }
} 

