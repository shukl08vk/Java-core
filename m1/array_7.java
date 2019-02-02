package m1;

import java.util.Arrays;

public class array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {20,10,30,99,99,10,40,20};
		
		dup(arr);

	}

	private static void dup(int[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		
		int temp = arr[0];
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			if(arr[i]!=arr[i+1])
					System.out.println(arr[i]);
			
			if(i==arr.length-2)
				System.out.println(arr[i+1]);
			}
		
		
		
	}

}
