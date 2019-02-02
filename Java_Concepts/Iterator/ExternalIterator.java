import java.util.Iterator;
import java.util.*;
import java.util.LinkedList;

public class ExternalIterator
{
    public static void main(String[] srgs)
    {
        List<String> list=new LinkedList<>();
        list.add("ram");
        list.add("shyam");
        list.add("geeta");
        list.add("seeta");

        Iterator<String> nameiterate=list.iterator();
        while(nameiterate.hasNext())
        {
            System.out.println(nameiterate.next());
        }
    }
}