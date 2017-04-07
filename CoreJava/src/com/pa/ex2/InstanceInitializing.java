package com.pa.ex2;

public class InstanceInitializing {

	private int totalValue = initializeInstanceVariable();

	InstanceInitializing() {
	}

	InstanceInitializing(int totalValue) {
		this.totalValue = totalValue;
	}

	protected final int initializeInstanceVariable() {

		return 20;
	}

	public static void main(String[] args) {
		InstanceInitializing instance1 = new InstanceInitializing();
		System.out.println("widgets value :" + instance1.totalValue);

		InstanceInitializing instance2 = new InstanceInitializing(30);
		System.out.println("widgets value :" + instance2.totalValue);
	}
}
