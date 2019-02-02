package m1;

import java.util.Scanner;
class Shape
{
    void drawShape()
    {
        System.out.println("Drawing Shape");
    }
    void eraseShape()
    {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape
{
    void drawShape()
    {
        System.out.println("Drawing Circle");
    }
    void eraseShape()
    {
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape
{
    void drawShape()
    {
        System.out.println("Drawing Triangle");
    }
    void eraseShape()
    {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape
{
    void drawShape()
    {
        System.out.println("Drawing Square");
    }
    void eraseShape()
    {
        System.out.println("Erasing Square");
    }
}
public class class_shape
{
	public static void main(String[] args) {
	    Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        c.drawShape();
        c.eraseShape();
        t.drawShape();
        t.eraseShape();
        s.drawShape();
        s.eraseShape();
	}
}
