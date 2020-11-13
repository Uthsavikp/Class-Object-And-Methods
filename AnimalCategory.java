abstract class Animal {
	abstract void move();
	abstract void eat();
	
	void label() {
		System.out.println("Animal's information:");
	}
}

class Bird extends Animal {
	
	void move() {
		System.out.println("Bird moves by flying.");
	}
	void eat() {
		System.out.println("Bird eats bird food.");
	}
}

 class Fish extends Animal {
	void move() {
		System.out.println("Fish moves by swimming.");
		
	}
	void eat() {
		System.out.println("Fish eats seafood.");
	}
}

public class AnimalCategory {
	public static void main(String[] args) {
		Animal myFish = new Fish();
		Animal myBird = new Bird();
		
		myFish.label();
		myFish.move();
		myFish.eat();
		myBird.label();
		myBird.move();
		myBird.eat();
	}
} 


