package questions;

public class LNCTgroup
{
    public static void main(String[] args) 
    {
       LNCTgroup a=new LNCTgroup();

        LNCTmain b=a.new LNCTmain();
        JNCT c=a.new JNCT();
        LNCTE d=a.new LNCTE();
        LNCTS e=a.new LNCTS(); 

         System.out.println("Total LNCT main CSE branch Students is "+b.CSEstudent);
         System.out.println("Total LNCT main EC branch Students is "+b.ECstudent+"\n");

         System.out.println("Total JNCT CSE branch Students is "+c.CSEstudent);
         System.out.println("Total JNCT EC branch Students is "+c.ECstudent+"\n");

         System.out.println("Total LNCTE CSE branch Students is "+d.CSEstudent);
         System.out.println("Total LNCTE EC branch Students is "+d.ECstudent+"\n");

         System.out.println("Total LNCTS CSE branch Students is "+e.CSEstudent);
         System.out.println("Total LNCTS EC branch Students is "+e.ECstudent+"\n");
    }
           
    class LNCTmain
    {
        int CSEstudent=55;
        int ECstudent=49;
    }
    class JNCT
    {
        int CSEstudent=80;
        int ECstudent=48;
    }
    class LNCTE
    {
        int CSEstudent=90;
        int ECstudent=58;
    }
    class LNCTS
    {
        int CSEstudent=86;
        int ECstudent=53;
    }
}