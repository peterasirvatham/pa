package com.pa.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamExamples {

	public static void main(String args[]) {
		StreamExamples se = new StreamExamples();
		se.fileOutputStreamWrite();
		se.fileInputStreamRead();
		se.fileBufferedOutputStreamWrite();
		se.fileBufferedInputStreamRead();
	}

	private void fileOutputStreamWrite() {
		try {
			FileOutputStream fout = new FileOutputStream("testout.txt");
			String s = "Welcome to java. FileOutputStream / FileInputStream";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			// fout.write(65); // Writing as int.
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void fileInputStreamRead() {
		try {
			FileInputStream fin = new FileInputStream("testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void fileBufferedOutputStreamWrite() {
		try {
			FileOutputStream fout = new FileOutputStream("testout1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Welcome to java BufferedOutputStream / BufferedInputStream ";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void fileBufferedInputStreamRead() {
		try {
			FileInputStream fin = new FileInputStream("testout1.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
