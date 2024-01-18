package memoryManagment;

public class rightshift 
{
  public static void main(String[] args) 
  {
    int x=5;
    int y=-5;
    int z=0b11111111111111111111111111111011; //-5 binary
    System.out.println(x>>32);
    System.out.println(y>>0);  // 1111...........1011
    System.out.println(y>>1);  // 1111...........1101
    System.out.println(y>>2);  // 1111...........1110
    System.out.println(y>>3);  // 1111...........1111
    System.out.println(y>>4);  // 1111...........1111
    System.out.println(y>>31); // 1111...........1111
    System.out.println(z>>21);
  }  
}

