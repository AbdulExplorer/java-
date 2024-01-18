package control;

public class q8 
{
  public static void main(String[] args) 
  {
    
    char c='a';

    String y= (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u') ? c+" is vowel" : c+" is a consonant";
    System.out.println(y);

    //   if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
    //   System.out.println(c+" is vowel");
    //   else
    //   System.out.println(c+" is a consonant");

  }  
}
