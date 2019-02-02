package m1;

public class excep_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "A";
		try {
		System.out.println(Math.pow(Integer.parseInt(a), 2));
		}catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}

	}

}
