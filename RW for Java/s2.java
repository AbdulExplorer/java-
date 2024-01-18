/*create 2 non static methord named india and shrilanka and creat an object 
inside india and ceat obj inside shrilanka the obj which is in india has
2 variables named virat and gill virat holds the run of virat kolhi and gil holds
run of gills the obj which is inside shrilanka as 2 data members named bumra and shami 
bumra has no. of vickets and shami has no. of wickets*/

public class s2 
{
  int virat;
  int gill;
  s2()
  {

  }
  s2(int a, int b)
  {
    virat=a;
    gill=b;
  }

  static void india()
  {
   s2 x=new s2(88,92);

   System.out.println("virat score "+x.virat);
   System.out.println("gill score "+x.gill);
  }
}
class s3
{
  int bumra;
  int shami;

  s3()
  {

  }
  s3(int a,int b)
  {
    bumra=a;
    shami=b;
  }

  static void shirilanka()
  {
    s3 x=new s3(1,5);

    System.out.println("bumra score "+x.bumra);
    System.out.println("shami score "+x.shami);
  }
}

class M
{
  public static void main(String[] args) 
  {
   s2.india();

   s3.shirilanka();
  }
}


