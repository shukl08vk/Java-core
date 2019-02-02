package m1;

import java.util.Scanner;

public class string_concat {
	
	public static void main(String args[])
	   {
	      String str1,str2, res = "";
	      Scanner sc = new Scanner(System.in);
	 
	      
	      System.out.println("Enter first string:");
	      str1 = sc.nextLine();
	      System.out.println("Enter Second string:");
	      str2 = sc.nextLine();
	      int length1 = str1.length();
	      int length2 = str2.length();
	      if(length1<length2)
	      res=res+str1+str2+str1;
	      else if(length2<length1)
	      res=res+str2+str1+str2;
	      System.out.println(res);
	   }

}
