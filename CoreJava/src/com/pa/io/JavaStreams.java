package com.pa.io;

import java.io.IOException;

public class JavaStreams {

	public static void main(String[] args) throws IOException {
		int i=System.in.read();
		System.out.println((char)i);
		System.out.println(i);
		System.err.println("error message");  
	}
}
