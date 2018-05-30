package joop;

public class Animal {

	String name;
	int age;
	int speed;

	public static void main(String[] args) {

		Animal tiger;
		Animal lion;

		tiger = new Animal();
		lion = new Animal();

		String tg = tiger.name = "Sunny";
		String lo = lion.name = "Dizzo";

		int run1 = tiger.speed(30);
		// System.out.println(run);
		int run2 = lion.speed(20);

		tiger.type(tg + " Is the fighter and runs " + run1 + " Kilometer per hour.");
		lion.type(lo + " Is the various and runs " + run2 + " Kilometer per hour.");

	}

	public void type(String says) {

		System.out.println(says);

	}

	public int speed(int i) {

		return i + 30;

	}

	public static Animal birth(Animal animal) {

		Animal tiger = new Animal();

		tiger.name = "Thory";

		return tiger;

	}

}
