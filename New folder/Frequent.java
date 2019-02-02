public class Frequent{
    public static void main(String[] args)
    {
        int a=123;
        int b=123;
        int c=123;
        int d=321;
        count(a,b,c,d);

    }
    public static void count(int a,int b,int c,int d)
    {
        int[] arr={a,b,c,d};
        int[] barr=new int[4];
        int count=0,max,maxin=0;
        //System.out.print("hello");
        for(int i=0;i<4;i++)
        { //System.out.print("hello1");
        count=0;    
        while(arr[i]>0)
            {count+=1;
                //System.out.print("hello2");
                arr[i]=arr[i]/10;
            }
            barr[i]=count;

        }
            max=barr[0];
            for(int i=1;i<4;i++)
            {
                if(barr[i]>max)
                {
                    max=barr[i];
                    maxin=i;
                }
                
                else if(i==maxin&&max==barr[i])
                {   
                    c=arr[i];
                }

        

                }
            System.out.println(c);
    }
}