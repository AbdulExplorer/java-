package questions;
/*create 2 non static method named india and shirilanka and creat an object an inside
india and ceat obj inside and shrilanka theobj inside shirilanka  */

  public class cricket 
  {
      int virat;
      int gill;
  
      cricket ()
      {
  
      }
  
      cricket(int a,int b)
      { 
          virat=a;
          gill=b;
      }
  
      public static void main(String[] args) {
          // cricket obj1=new cricket();
          // obj1.india();
          india();
  
          // srilanka obj2=new srilanka();
          // obj2.lanka();
          srilanka.lanka();
      }
  
      static void india()
      {
          cricket a=new cricket(88,92);
  
          System.out.println("Virat Sir : "+a.virat);
          System.out.println("Gill : "+a.gill);
      } 
  } 
  
  class srilanka
  {
      int bumrah;
      int shami;
  
      srilanka()
      {
  
      }
      srilanka(int a,int b)
      {
          bumrah=a;
          shami=b;
      }
  
  
     static void lanka()
      {
          srilanka b=new srilanka(1,5);
          System.out.println("Boom Boom Bumrah : "+b.bumrah);
          System.out.println("Mohammad Shami : "+b.shami);
      }
  }
    

