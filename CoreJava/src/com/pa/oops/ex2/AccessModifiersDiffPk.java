package com.pa.oops.ex2;

import com.pa.oops.ex1.AccessModifiersParent;

public class AccessModifiersDiffPk extends AccessModifiersParent {

	public static void main(String[] arg) {
		AccessModifiersDiffPk parent = new AccessModifiersDiffPk();
		System.out.println("Public : " + parent.publicInstanceMember);
		System.out.println("Protected : " + parent.protectedInstanceMember);
		//System.out.println("Default : " + parent.instanceMember);
		//System.out.println("Private : " + parent.privateInstanceMember);

		parent.publicMethod();
		parent.protectedMethod();
		//parent.defaultMethod();
		//parent.privateMethod();
	}

}
