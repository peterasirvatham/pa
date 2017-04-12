package com.pa.oops.ex1;

public class AccessModifiersChild extends AccessModifiersParent {

	public static void main(String[] arg) {
		AccessModifiersParent parent = new AccessModifiersParent();
		System.out.println("Public : " + parent.publicInstanceMember);
		System.out.println("Protected : " + parent.protectedInstanceMember);
		System.out.println("Default : " + parent.instanceMember);
		//System.out.println("Private : " + parent.privateInstanceMember);
		
		parent.publicMethod();
		parent.protectedMethod();
		parent.defaultMethod();
		//parent.privateMethod();
	}
}
