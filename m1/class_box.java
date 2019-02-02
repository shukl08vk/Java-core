package m1;

import java.util.Scanner;
class Box
{
    double width,length,height;
    void initialize()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter width");
        width=s.nextInt();
        s.nextLine();
        System.out.println("Enter Length");
        length=s.nextInt();
        s.nextLine();
        System.out.println("Enter Height");
        height=s.nextInt();
    }
    double volume()
    {
        return width*length*height;
    }
}
public class class_box
{
	public static void main(String[] args) {
	    Box b=new Box();
        b.initialize();
		System.out.println("Volume is "+b.volume());
	}
}