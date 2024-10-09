package org.java.adder;

public class AddExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String literal = "example"; // String Pool (PermGen에 위치)
		String literal2 = "example";
		String newString = new String("example"); // 새로운 객체 (힙 영역에 위치)
		System.out.println(newString == literal);
		int result2 = calculator.addUseStackMemory(2,3);
		System.out.println(result2);

		calculator = null;

	}
}

class Calculator{
	public int addUseStackMemory(int num1, int num2){
		return num1 + num2;
	}
}
