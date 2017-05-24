package com.pa.oops.calc;

import java.util.Scanner;

public class Calculator {

	private float firstOperannd;
	private float secondOperannd;
	private float result;
	private int operator;
	private Scanner input = new Scanner(System.in);
	private boolean exitCalculator = false;

	public void startCalculator() {
		while (!exitCalculator) {

			System.out.println("Enter 1 for addition \n" + "Enter 2 for subtraction \n"
					+ "Enter 3 for multiplication \n" + "Enter 4 for division \n" + "Enter 0 for Exit : ");
			operator = input.nextInt();

			switch (operator) {
			case 1:
				result = add();
				System.out.println("Result is " + result);
				break;

			case 2:
				result = subtract();
				System.out.println("Result is " + result);
				break;

			case 3:
				result = multiply();
				System.out.println("Result is " + result);
				break;

			case 4:
				result = divide();
				System.out.println("Result is " + result);
				break;

			case 0:
				exitCalculator = true;
				System.out.println("Calculator program Terminated \n");
				break;

			default:
				System.out.println("Please provide proper input \n");

			}
		}
	}

	private float add() {
		System.out.println("Enter first number : ");
		firstOperannd = input.nextInt();
		System.out.println("Enter second number : ");
		secondOperannd = input.nextInt();
		return firstOperannd + secondOperannd;
	}

	private float subtract() {
		System.out.println("Enter first number : ");
		firstOperannd = input.nextInt();
		System.out.println("Enter second number : ");
		secondOperannd = input.nextInt();
		return firstOperannd - secondOperannd;
	}

	private float multiply() {
		System.out.println("Enter first number : ");
		firstOperannd = input.nextInt();
		System.out.println("Enter second number : ");
		secondOperannd = input.nextInt();
		return firstOperannd * secondOperannd;
	}

	private float divide() {
		System.out.println("Enter first number : ");
		firstOperannd = input.nextInt();
		System.out.println("Enter second number : ");
		secondOperannd = input.nextInt();
		return firstOperannd / secondOperannd;
	}

	public static void main(String[] args) {
    	 
		Calculator calculator = new Calculator();
        calculator.startCalculator();
	}
}