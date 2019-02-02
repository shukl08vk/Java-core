class Player
{
    String name;
    String game;
    static String nation="England";
    void show()
    {
        System.out.println("name is"+name);
        System.out.println("name is"+game);
        System.out.println("name is"+nation);

    }
    Player(String S1,String S2)
    {
        name=S1;
        game=S2;
        nation="India";
    }
    static 
    {
        nation="Australia";
    }
    static void A()
    {
        System.out.println("static method");
       // System.out.println(name+" "+game+" ");
        System.out.println(nation);
    }

}

public class Maineg{
    public static void main(String[] arg)
    {
        Player.A();
        Player p1=new Player("ss","Cricket");
        p1.show();
    }
}