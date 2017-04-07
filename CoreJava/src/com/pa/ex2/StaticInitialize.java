package com.pa.ex2;

public class StaticInitialize {
	private static int sumValue;
	
	static {
		System.out.println("Static");
		sumValue = 10;
	}

	{
		sumValue = 20;
		System.out.println("Non-static block");
	}

	public static void main(String[] args) {
		System.out.println("Sum value :" + sumValue);
		StaticInitialize si1 = new StaticInitialize();
		System.out.println("Sum value :" + sumValue);
		StaticInitialize si2 = new StaticInitialize();
		System.out.println("Sum value :" + sumValue);
	}

}
