import java.util.*;

public class Pelincheck{
	public static void main()
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{if(!set.contains(str.charAt(i)))
			set.add(str.charAt(i));
		else set.remove(str.charAt(i));
		}
		if(set.size()<=1)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
		
		
		
		
		