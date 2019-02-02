package m1;

import java.util.Arrays;

public class array_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,10,50,39,39,39};
		
		freq(arr);

	}

	private static void freq(int[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		
		int max = 1,count= 1,res=arr[0];
		
		for(int i = 1 ; i < arr.length ;i++) {
			
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				
				if(count>max) {
					max = count;
					res = arr[i-1];
				}
				count=1;
			}
			
			if(count>max) {
				max = count;
				res = arr[i-1];
			}
		
			
		}
		System.out.println(res);
		
	}

}
