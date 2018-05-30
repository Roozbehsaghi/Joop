package pack2;

import pack1.Class1;

public class Class2 extends Class1 {

	public static void main(String[] args) {

		System.out.println("2 is ok");

		ClassB c2 = new ClassB();

		c2.show("test run class2");

		System.out.println(c2.age);

	}

}
