package cscorner;
class Animals{
	void sound() {
		System.out.println("Animals makes sound");
	}
}
class Dog extends Animals{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animals{
	void sound() {
		System.out.println("Cat Meows");
	}
}
public class Main {

	public static void main(String[] args) {
		Animals a1=new Animals();
		Animals a2=new Dog();
		Animals a3=new Cat();
		a1.sound();
		a2.sound();
		a3.sound();

	}

}
