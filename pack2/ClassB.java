package pack2;

import pack1.ClassA;

public class ClassB extends ClassA {

	public int age = 3;

	public static void show(String text) {

		System.out.println(text);

	}

	public static void main(String[] args) {

		System.out.println("b is ok");

		ClassB bb = new ClassB();

		bb.show("test run classB");

	}

}