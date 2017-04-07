package com.pa.ex2;

public class EnumTest {

	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}

	Company cName;

	public EnumTest(Company cName) {
		this.cName = cName;
	}

	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;

		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;

		case GOOGLE:
			System.out.println("Google - biggest search giant..");
			break;
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;

		default:
			System.out.println(" No input provided");
			break;
		}
	}

	public static void main(String[] args) {
		EnumTest ebay = new EnumTest(Company.GOOGLE);
		ebay.companyDetails();

	}
}
