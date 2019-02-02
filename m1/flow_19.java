package m1;

public class flow_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0 ,start = 30;
		
		while(count!=5) {
			
			if(start%2==0)
				if(start%3==0)
					if(start%5==0)
						{count++;System.out.println(start);}
			start+=5;
			
		}

	}

}
