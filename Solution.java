import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
       int a=0;
        int c;
        int n=scan.nextInt();
        int k=scan.nextInt();
        
        int bill[]=new int[10];
        for(int i=0;i<n;i++)
        {bill[i]=scan.nextInt();
        }
        int b=scan.nextInt();
        for(int i=0;i<n;i++)
        {if(i!=k)
        {
            a+=bill[i];
        }
        }
       a=a/2;
        //c=b-a;
    //System.out.println(a);
    //System.out.println(c);
   //System.out.println(b);
         if(a!=b)
        {System.out.println(b-a);
        }
        else
             System.out.println("Bon Appetit");
            
         
         
            
        
        
        
        
    }
}