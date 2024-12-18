package interfacaDemo;

interface Animal{
	int Age=2;    
	void eat();
	
	default void sleep() {
		System.out.println("in pillow");
	}
}

class dog implements Animal{
	public void eat() {
		System.out.println("fish");
	}
	public void sleep() {
		System.out.println("in pillow");
	}
}

public class classOne {

	public static void main(String[] args) {
		dog Dog = new dog();
		Dog.eat();
		Dog.sleep(); 
		System.out.println(Dog.Age);

	}
}
