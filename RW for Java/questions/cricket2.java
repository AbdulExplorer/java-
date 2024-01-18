package questions;

/*create 2 non static methord named india and shrilanka and creat an object 
inside india and ceat obj inside shrilanka the obj which is in india has
2 variables named virat and gill virat holds the run of virat kolhi and gill holds
run of gills the obj which is inside shrilanka as 2 data members named bumra and shami 
bumra has no. of vickets and shami has no. of wickets*/

public class cricket2 
{
    public static void main(String[] args) 
    {
        c1 x = new c1 (88,92); //object
        x.india(); //calling non static 

        c2 y =new c2 (1,5); //object
        y.shirilanka(); //calling non static
        
    }
    
}
class c1
{
    int virat,gill; //instance variable
    
    c1() //default constrctor
    {

    }
    c1(int a,int b) //perametrise constrctor
    {
      virat=a;
      gill=b;
    }

    void india() // non static method
    {
        c1 x = new c1 (88,92); //object 

        System.out.println("virat "+x.virat); 
        System.out.println("gill "+x.gill);
    }
}
class c2
{
  int bumra, shami; //instance variable

  c2() //default constrctor
  {

  }

  c2(int a,int b) //perametrise constrctor
  {
    bumra=a;
    shami=b;
  }

  void shirilanka() //non static method
  {
     c2 y=new c2(1,5); //object

     System.out.println("bumra "+y.bumra); 
     System.out.println("shami "+y.shami);
  }

}
