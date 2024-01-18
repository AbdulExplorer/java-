public class MPnagar 
{
    public static void main(String[] args) 
    {
        zone1 ref = new zone1();
        System.out.println(zone1.x);
        zone1.x=40;
        System.out.println(zone1.x);
        System.out.println(ref.y);
    }
}
    class zone1
    {
        static int x = 30;
        int y = 40;
    }