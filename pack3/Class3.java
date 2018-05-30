package pack3;

import pack2.Class2;
import pack2.ClassB;

public class Class3 extends Class2 {

	public static void main(String[] args) {

		System.out.println("3 is ok");

		ClassB c3 = new ClassB();

		c3.show("test run class3");

		ClassB.show("comming from Class3");

		System.out.println(c3.age);

	}

}
