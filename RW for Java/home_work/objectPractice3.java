package home_work;

public class objectPractice3 
{
     public static void main(String[] args) 
    {
        int a= 7; // local variable
        objectPractice3 sc= new objectPractice3(); // creating object sc of class 
        sc.object(a); // calling the non static method
        System.out.println(sc.object(a)); //printing the vale of object
    } 
      int object(int n) // using non static method
    {
     int ans = n*n*n; //storing the value n*n*n in ans 
     return ans; //return ans and terminate
    }   
}