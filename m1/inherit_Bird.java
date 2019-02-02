package m1;

class Animal{
	
	public void eat() {
		System.out.println("Animal is Eating");
	}
	
	public void sleep() {
		System.out.println("Animal is Sleeping");
	}
}

public class inherit_Bird extends Animal {
	
	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird is Eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Bird is Sleeping");
	}
	
	public void fly() {
		System.out.println("Bird is Flying");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		
		inherit_Bird b = new inherit_Bird();
		
		b.eat();
		b.sleep();
		b.fly();
		
		

	}

}
