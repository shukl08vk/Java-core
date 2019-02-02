import java.util.Scanner;
import java.util.Arrays;
public class Program{
	public static void main(String[] arg)
	{	int a[]=new int[3];
		int arr[][]=new int[3][3];
		int j=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{a[i]=scan.nextInt();
		}
		for(int i=0;i<3;i++)
		{	j=0;
				while(a[i]>0&&j<3)
				{
					arr[i][j]=a[i]%10;
					a[i]=a[i]/10;
					j+=1;
				}
			}
			
			for(int i=0;i<3;i++)
			{Arrays.sort(arr[i]);
			//System.out.println(arr[i]);
			}
		/*for(int i=0;i<3;i++)
		{
			if(arr[i]==arr)*/
			for(int row=0;row<3;row++)
			{
				for(int k=0;k<3;k++)
				{
						for(int col=0;col<3;col++)
						{
							if(arr[row][col]!=arr[k][col])
							{
								break;
							}
						}
					count+=1;
				}
				if(count>1)
				{
					System.out.println(count);
					break;
				}
			}
	}
}

			
			