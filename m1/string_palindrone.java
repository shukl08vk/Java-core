package m1;

public class string_palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba",reverse = "";
		
		int n = s.length();
		 
	      for ( int i = n - 1; i >= 0; i-- )
	         reverse = reverse + s.charAt(i);
	 
	      if (s.equals(reverse))
	         System.out.println("palindrome.");
	      else
	         System.out.println("Not palindrome.");

	}

}
