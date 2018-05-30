package joop;

public class Bicycle {

	String color;
	String brand;

	public static void main(String[] args) {

		Bicycle bike1 = new Bicycle();
		bike1.color = "Green";
		// bike1.brand = (bike1);

		Bicycle bike2 = new Bicycle();

		System.out.println(bike2.brand = "Gazelle");

		System.out.println(bike1.color = "Blue");

	}

	int frame(Bicycle bike) {

		System.out.println("20");

		return 0;

	}

	private void frame(String color) {

		System.out.println("20");

	}

	public int frame(int size) {

		System.out.println("20");

		return size;

	}

}

class Wheel extends Bicycle {

	Wheel bike3 = new Wheel();

	@Override
	public int frame(Bicycle bike) {

		System.out.println(bike.brand = "Trek");

		return 20;

	}

	void frame(String color) {

	}

}
