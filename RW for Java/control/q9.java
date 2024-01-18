package control;

public class q9 
{
  //perfect we wil do again
 
  public static void main(String[] args) 
  {
     
    char ch='$';

    String y= ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' ? ch+ " is alphabet": ch>=0&&ch<=9 ? ch+ " is digit" : ch+" is special character";
    System.out.println(y);

    if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
    System.out.println(ch+ " is alphabet");
    else if (ch>=0&&ch<=9)
    System.out.println(ch+ " is digit");
    else
    System.out.println(ch+ " is special character");
  
  }  
}
