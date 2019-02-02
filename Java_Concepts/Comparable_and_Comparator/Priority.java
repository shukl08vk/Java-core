import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.*;
//import com.sun.javafx.collections.MappingChange.Map;

class Priority{
    public static void main(String[] arg)
    {HashMap<String,Integer> map=new HashMap<String,Integer>(7);
        map.put("a",3);
       map.put("b",2);


        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(new Comparator<Map.Entry<String,Integer>>()
        {
            @Override
            public int compare(Map.Entry<String,Integer> e1,Map.Entry<String,Integer> e2)
            {
                return e1.getValue()-e2.getValue();
            }
        });
      for(Map.Entry<String,Integer> entry:map.entrySet())
            pq.add(entry);
       // pq.add();

        for(int i=0;i<2;i++)
        {
            System.out.println(pq.poll());
        }
    }
