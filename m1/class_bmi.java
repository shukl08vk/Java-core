package m1;

import java.util.Scanner;

class Patient
	{
	    String n;
	    double w,h;
	    Patient()
	    {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter name of Patient\n");
	        n=s.nextLine();
	        System.out.println("Enter weight\n");
	        w=s.nextDouble();
	        s.nextLine();
	        System.out.println("Enter height\n");
	        h=s.nextDouble();
	    }
	    double BMI()
	    {
	        return (w/(h*h))*703;
	    }
	}
	public class class_bmi
	{
		public static void main(String[] args) {
			Patient p=new Patient();
			System.out.println("BMI of "+p.n+" is "+p.BMI());
		}
	}


