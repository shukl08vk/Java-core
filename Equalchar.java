import java.util.*;
public class Equalchar{
    public static void main(String[] arg)
    {
        List<String> s1=new ArrayList<String>();
        String s="";
        s1.add("bob");
        System.out.println(s1.get(0).charAt(0)=='b');
        System.out.println(s1.get(0)=="bob");

    }
}