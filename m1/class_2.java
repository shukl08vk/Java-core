package m1;


class Calculator{
	
	public static double powerInt(int n1 , int n2) {
		
		return Math.pow(n1,n2);
		
	}
	
	public static double powerDouble(double n1,int n2) {
		return Math.pow(n1,n2);
	}
	
	
}


public class class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator.powerInt(2 , 2 ));
		System.out.println(Calculator.powerDouble(2.00, 3));
		
		

	}

}
