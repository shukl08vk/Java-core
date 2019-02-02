import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution1{
    public static void main(String[] args) throws java.lang.Exception
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        List<String> s1=new ArrayList<String>();
        List<String> s2=new ArrayList<String>();
        int in=Integer.parseInt(sc.readLine());
        for(int i=0;i<in;i++)
        {
             s1.add(sc.readLine());
             s2.add(sc.readLine());
        }
        //System.out.println(s1.get(0));
        //System.out.println(s2);
        for(int i=0;i<in;i++)
            {
    
           
            String s3="";
            String s4="";
           // System.out.println("Tag 1");
            for(int j=0;j<3;j++)
                {//System.out.println("Tag 2");
               // System.out.println(type(s1.get(i).charAt(j))+"##");
                 if(s1.get(i).charAt(j)=='b'||s1.get(i).charAt(j)=='o')
                    { //System.out.println("s3 true");
                    s3=s3+s1.get(i).charAt(j);
                    }
                else { //System.out.println("s3 false");
                    
                    s3=s3+s2.get(i).charAt(j);
                        }
                //System.out.println("Tag 3");
                if(s2.get(i).charAt(j)=='b'||s2.get(i).charAt(j)=='o')
                    { //System.out.println("s3 true");
                    s4+=s2.get(i).charAt(j);
                    }
                else { //System.out.println("s4 true");
                        s4=s4+s1.get(i).charAt(j);
                        //System.out.println("s4 false");
                    }
                }
                //System.out.println(s3+" "+s4);
                //System.out.println(s3=="bob");
            if((s3.equals("bbo")||s3.equals("bob")||s3.equals("obb"))&&(s4.equals("bbo")||s4.equals("bob")||s4.equals("obb")))
                {//System.out.println("Tag 5");
                    System.out.println("yes");
                }
            else System.out.println("no");
            }
            
    }

}
    