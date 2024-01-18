package control;

public class q7 
{
  public static void main(String[] args) 
  //
  {
   
    char ch='i';

    String y= ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' ? ch+ " is a alphabet" : ch+ " is not a alphabet";
    System.out.println(y);

    if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
    System.out.println(ch+ " is a alphabet");
    else
    System.out.println(ch+" is not a alphabet");


  }    
}
