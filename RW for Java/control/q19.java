package control;

public class q19 
{
  public static void main(String[] args) 
  {
    int p=90, c=80, b= 90, m=70, cs=90;
    int sum, per;
    sum=p+c+b+m+cs;
    per=(sum/5);

    String y= per>=90 ? "percentage is "+per+" grade A" : per>=80 ? "percentage is "+per+" grade B" : per>=70 ? "percentage is "+per+" grade C" : per>=60 ? "percentage is "+per+" grade D" : per>=40 ? "percentage is "+per+" grade E" : "percentage is "+per+" grade F";
    System.out.println(y);

    if(per>=90)
    System.out.println("percentage is "+per+" grade A");
    else if(per>=80)
    System.out.println("percentage is "+per+" grade B");
    else if(per>=70)
    System.out.println("percentage is "+per+" grade C");
    else if(per>=60)
    System.out.println("percentage is "+per+" grade D");
    else if(per>=40)
    System.out.println("percentage is "+per+" grade E");
    else
    System.out.println("percentage is "+per+" grade F");
  }  
}
