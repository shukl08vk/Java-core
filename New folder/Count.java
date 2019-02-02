import java.util.*;

public class Count{
    public static void main(String[] argv)
    {
        int a=109894;
        nonrepeat(a);
    }
    public static void nonrepeat(int a)
    {   String s=Integer.toString(a);
        Set<Character> set=new HashSet<Character>();
       for(int i=0;i<s.length();i++)
        {if(!set.contains(s.charAt(i)))
            set.add(s.charAt(i));
        else set.remove(s.charAt(i));
        }
        System.out.println(set.size());
    }
}