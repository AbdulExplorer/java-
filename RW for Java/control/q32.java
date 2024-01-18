package control;

public class q32 
{
  public static void main(String[] args) 
  {
        float l=6;
        float b=8;

        float area= l*b;
        float perimeter= 2* (l + b);

        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);

        if(area > perimeter)
        {
            System.out.println("Area is greater than perimeter");
        }
        else if(area < perimeter)
        {
            System.out.println("Area is less than perimeter");
        }
        else
        {
            System.out.println("Area and Perimeter are both equal");
        }

    String str= area>perimeter ? "Area is greater than perimeter" : area < perimeter ? "Area is less than perimeter" : "Area and Perimeter are both equal";
    System.out.println(str);
    }  
}
