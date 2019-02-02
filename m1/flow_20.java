package m1;

import java.util.Scanner;

public class flow_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b;
		char c;
		
		boolean flag = true;
		
		do {
			
			System.out.println("1.Add");
			System.out.println("2.Sub");
			
			int n = sc.nextInt();
			
			switch(n) {
			case 1:System.out.println("Enter Two Numbers");
					a= sc.nextInt();b=sc.nextInt();System.out.println(a+b);break;
			
			case 2:System.out.println("Enter Two Numbers");
					a= sc.nextInt();b=sc.nextInt();System.out.println(a-b);break;
			}
			
			System.out.println("Do you want to continue Y/N?");
			 
			c = sc.next().charAt(0);
			 if(c=='Y')
				 continue;
			 else
				 flag = false;
			
		}while(flag);
		
		
		
	}

}
