import java.util.Scanner;

class DiagonalSum
{   public int sum(int [][] arr1,int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {   System.out.println(arr1[i][i]);
            sum=sum+arr1[i][i];
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr1[i][n-k-1]);
                    sum+=arr1[i][n-k-1];
            k+=1;    
            
        }
        return sum;
    }

    public static void main(String[] arg)
    {
        int[][] arr1=new int[50][50];
        DiagonalSum d1=new DiagonalSum();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();            
            }
        }
        System.out.println(d1.sum(arr1,n));
    }
}