package m1;

import java.util.Scanner;

public class flow_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.printf("*");
			}	
			System.out.printf("\n");
			
		}

	}

}
