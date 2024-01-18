package control;

public class q10 
{
  public static void main(String[] args) 
  {
    char ch='A';

    String y= ch>='a'&&ch<='z' ? ch+ " is lowercase" : ch+ " is uppercase";
    System.out.println(y);
    
    if(ch>='a'&&ch<='z')
    System.out.println(ch+ " is lowercase");
    else
    System.out.println(ch+ " is uppercase");


  }  
}
