public class prePostFix 
{
  public static void main(String[] args) 
  {
    int x=2, y=3, z=4; 

    int    ans = -x + y-- * -z-- / (x++ / --y * z) -x++ * x * y * z;
    // double ans1= -x + y-- * -z-- / (x++ / --y * z) -x++ * x * y * z;

    System.out.println(ans);
    // System.out.println(ans1);
  }  
}
