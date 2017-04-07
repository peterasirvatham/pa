package com.pa.ex2;

public class WrapperAndAutoboxing {

	public static void main(String args[]) {
		WrapperAndAutoboxing instance = new WrapperAndAutoboxing();
		System.out.println("Autoboxing ");
		instance.autoboxing();
		System.out.println("Unboxing ");
		instance.unboxing();
	}

	void autoboxing() {
		// Converting int into Integer
		int a = 20;
		// legacy way of converting int into Integer
		Integer i = Integer.valueOf(a);
		// autoboxing, now compiler will write Integer.valueOf(a) internally
		Integer j = a;

		System.out.println("Value of a :" + a);
		System.out.println("Value of i :" + i);
		System.out.println("Value of j :" + j);
	}

	void unboxing() {
		// Converting Integer to int
		Integer a = new Integer(3);
		// legacy way of converting Integer to int
		int i = a.intValue();
		// unboxing, now compiler will write a.intValue() internally
		int j = a;

		System.out.println("Value of a :" + a);
		System.out.println("Value of i :" + i);
		System.out.println("Value of j :" + j);
	}

}
