package memoryManagment;

public class unsignedRightShift 
{
  public static void main(String[] args)
  {
    int x=-5;
    int y=0b11111111111111111111111111111011;
    System.out.println(x>>>2); //Q: Agar sign lagaya to ans kis besis pe aayega ?
    System.out.println(y>>>2);
    System.out.println(~(5));  //Q: complimant kar ne pe value - main kio aara hi hai ?
    System.out.println(~(-5)); 

  }                            
}
