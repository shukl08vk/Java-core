import java.util.Scanner;
public class Learn{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String name[]=new String[5];
	int value[]=new int[5];
	int len;
	for(int i=0;i<3;i++)
	{
	name[i]=sc.nextLine();
	value[i]=Integer.parseInt(sc.nextLine());
	}
	for(int i=0;i<3;i++)
	{
	System.out.print(name[i]);
	len=name[i].length();
	for(int j=0;j<14-len;j++)
	{
		System.out.print(" ");
	}
	System.out.println(value[i]);
	}
	}
}

// Topic to Remember::::
/* Three ways of spacing
1. Monospace formatting 
2. Formatter spacing System.out.format("%4d",i);
3. Loop spacing "use loop".*/
