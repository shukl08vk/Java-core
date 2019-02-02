
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
       
        int[] arr=new int[100000000];
        int tp=0;;
        while(true)
        {System.out.println("loop1");
        Stack<Integer> st= new Stack<Integer>();
        int pos=0;
        boolean ch=false;
        int count=-1,good=0;
        int k=-1;
        tp=st.push(p[0]);
        arr[pos]=tp;
        count++;
        pos++;
        for(int i=1;i<p.length;i++)
        {   if(ch==true)
                {if(p[i]>k)
                    {
                        k=p[i];
                    
                    }
                 else {ch=false;
                        arr[pos]=st.push(p[i]);
                        System.out.print(st.peek()+" ");
                        pos++;
                        count++;
                      }
                }
            else if(p[i]>tp)
                    {
                        ch=true;
                        k=p[i];
                    }
            else {arr[i]=st.push(p[i]);

                System.out.print(st.peek()+" ");  
                pos++;  
                count++;
            
                }
                                
        }
        System.out.println(count);
        for(int i=0;i<=count;i++)
            {    System.out.print(arr[i]+" ");
            }
            tp++;
        for(int i=0;i<count;i++)
        {
            if(arr[i]>arr[i+1])
            {
                good++;
            }
            else break;
        }
        if(good==count)
        {// System.out.println(good);
            break;
        }
       }
return tp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = {6,5,8,4,7,10,9};

        //String[] pItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //for (int i = 0; i < n; i++) {
        //    int pItem = Integer.parseInt(pItems[i]);
          //  p[i] = pItem;
        //}

      /*  for (int i = 0; i < n; i++) {
            //int pItem = Integer.parseInt(pItems[i]);
            //p[i] = pItem;
            System.out.println(p[i]);
        }*/

        int result = poisonousPlants(p);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
