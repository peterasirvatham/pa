package com.pa.io;

import java.util.StringTokenizer;

public class JavaStringTokenizerExample {

	public static void main(String[] args) {

		// create StringTokenizer object
		StringTokenizer st = new StringTokenizer("Java StringTokenizer Example");

		// iterate through tokens
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}
}