package m1;

class Fruit{
	int name,taste,size;
	
	public void eat() {
		System.out.println("Name: "+name+" - Taste - "+taste );
	}
}

class Apple extends Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+" - Taste - "+taste );
	}
	
	
	
}
class Orange extends Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+" - Taste - "+taste );
	}
	
	
	
}


public class overid_fruit {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
