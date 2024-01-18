import java.util.Scanner;
public class forloop
{
   public static void main(String[] args) 
//    {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter no. :");
//     int x = sc.nextInt();

//     for(int i=1;i<=x;i++)
//     {
//         if(i%2!=0)
//         System.out.println(i);
//     }
//    }  
// {
//     char a;
//   for(a=65;a<=90;a+=2)
//   {
//     System.out.println(a);
//   }
// }
{
   for(int x=0; x<10; x++)
   {
    System.out.println(x);
    for(int i=1; i>=10; i--)
    {
      System.out.println(i);
      for(int j=2; j<=10; j+=2)
      {
        System.out.println(j);
      }
    }
   }
}
        // int i, N=2;
        // for(i=1; i<=10; i++)
        // {
        //  System.out.println(N+" x "+i+" = "+N*i);
        // }



}
