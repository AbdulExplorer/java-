package home_work;

public class objectPractice2 
{
    
        double areaoftriangle(int l,int b)//using the non static method
        {
            double a= 0.5*l*b; //a is a variable which holds the vale (float) (0.5*(b*h));
            return a;
        }
        public static void main(String[] args) //main method
    {
        objectPractice2 areaoftriangle = new objectPractice2();
        System.out.println(areaoftriangle.areaoftriangle(10,20));
    }
    
}
