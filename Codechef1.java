import java.io.*;
import java.util.Scanner;

public class Codechef1{
    public static int gcd(int a,int b)
    {
        if(a%b==0)
            return b;
         else return gcd(b,a%b);
    }
    public static void main(String[] arg) throws Exception
    {
        int a,b,n,t,out;
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        //t=Integer.parseInt(bf.readLine());
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {   //a=Integer.parseInt(bf.readLine());
            //b=Integer.parseInt(bf.readLine());
            //n=Integer.parseInt(bf.readLine());
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            out=gcd((int)(Math.pow(a,n)+Math.pow(b,n)),Math.abs(a-b));
            //System.out.println(out);

            System.out.println(out%(10^9+7));

        }
    }
}