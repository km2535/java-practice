package org.java.ch7;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] data = new double[5];

		data[0] = 1.0;
		data[1] = 2.0;
		data[2] = 3.0;

		for(int i = 0; i<data.length; i++){
			System.out.println(data[i]);
		}
	}
}
