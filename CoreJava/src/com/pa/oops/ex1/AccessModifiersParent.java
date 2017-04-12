package com.pa.oops.ex1;

public class AccessModifiersParent {

	public String publicInstanceMember = "Public Instance Member Value";
	protected String protectedInstanceMember = "Protected Instance Member Value";
	String instanceMember = "Instance Member Value";
	private String privateInstanceMember = "Private Instance Member Value";

	public void publicMethod() {
		System.out.println("Public method invoked");
	}

	protected void protectedMethod() {
		System.out.println("Protected method invoked");
	}

	void defaultMethod() {
		System.out.println("Default method invoked");
	}

	private void privateMethod() {
		System.out.println("Private method invoked");
	}

	public static void main(String[] arg) {
		AccessModifiersParent parent = new AccessModifiersParent();
		System.out.println("Public : " + parent.publicInstanceMember);
		System.out.println("Protected : " + parent.protectedInstanceMember);
		System.out.println("Default : " + parent.instanceMember);
		System.out.println("Private : " + parent.privateInstanceMember);
		
		parent.publicMethod();
		parent.protectedMethod();
		parent.defaultMethod();
		parent.privateMethod();
	}

}
