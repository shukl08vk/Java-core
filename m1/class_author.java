package m1;

import java.util.Scanner;

class Author
{
    private String name,email;
    private char gender;
    Author()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Author's Name");
        name=s.nextLine();
        System.out.println("Enter Author's email");
        email=s.nextLine();
        System.out.println("Enter Author's gender");
        gender=s.next().charAt(0);
    }
    String getName()
    {
        return name;
    }
    String getEmail()
    {
        return email;
    }
    char getGender()
    {
        return gender;
    }
}
class Book
{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    Book()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter book's Name");
        name=s.nextLine();
        author=new Author();
        System.out.println("Enter book's price");
        price=s.nextDouble();
        s.nextLine();
        System.out.println("Enter book's Quantity");
        qtyInStock=s.nextInt();
    }
    String getName()
    {
        return name;
    }
    Author getAuthor()
    {
        return author;
    }
    double getPrice()
    {
        return price;
    }
    void setPrice(double p)
    {
        price=p;
    }
    int getQtyInStock()
    {
        return qtyInStock;
    }
    void setQtyInStock(int q)
    {
        qtyInStock=q;
    }
}
public class class_author
{
	public static void main(String[] args) {
		Book p=new Book();
		Author a=p.getAuthor();
		System.out.println("Book name is "+p.getName()+"\nprice is "+p.getPrice()+"\nQuantity is "+p.getQtyInStock());
		System.out.println("Author name is "+a.getName()+"\nemail id is "+a.getEmail()+"\nand gender is "+a.getGender());
	}
}
