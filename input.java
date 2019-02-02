import java.util.Scanner;
public class input{
	public static void main(String[] ar)
	{String prompt=ar[0];
	System.out.println(prompt);
	String name;
	int age;
	Scanner in=new Scanner(System.in);
	name=in.nextLine();
	age=in.nextInt();
	System.out.println("name: "+name+" age: "+age);
	}
}
	
		