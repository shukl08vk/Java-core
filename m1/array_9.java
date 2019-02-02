package m1;

public class array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 2,4,6,2,7,9 };
		
		boolean flag = true;
		
		int sum=0;
		
		for(int a:arr) {
			if(a==6)
				flag=false;
			
			if(flag)
				sum+=a;
			
			if(a==7)
				flag = true;
			
		}
		
		System.out.println(sum);
		

	}

}
