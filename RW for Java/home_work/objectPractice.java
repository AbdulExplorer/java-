package home_work;

   // Define a class named 'objectpractice'
public class objectPractice
{
    // Declare instance variables to represent state and capital
    String state;
    String capital;

    // Constructor to initialize the state and capital when an object is created
    objectPractice(String a, String b) 
    {
        state = a;
        capital = b;
    }

    // The main method where the program starts executing
    public static void main(String[] args) 
    {
        // Create objects of the 'objectpractice' class and initialize them with state and capital values
        objectPractice state1 = new objectPractice("UP", "lucknow");
        objectPractice state2 = new objectPractice("MP", "Bhopal");
        objectPractice state3 = new objectPractice("maharashtra","Mumbai");

        // Print information about the first state
        System.out.println(state1.state+"=>"+state1.capital);

        // Print information about the second state
        System.out.println(state2.state+"=>"+state2.capital);

        // Print information about the third state
        System.out.println(state3.state+"=>"+state3.capital);
