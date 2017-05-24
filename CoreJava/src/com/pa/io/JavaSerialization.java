package com.pa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class JavaSerialization {
	public static void main(String[] arg) {
		JavaSerialization js = new JavaSerialization();
		js.serialize();
		js.deSerialize();
	}

	private void serialize() {
		Student s1 = new Student(211, "leo");
		try {
			FileOutputStream fout = new FileOutputStream("serializedobject.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(s1);
			out.flush();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void deSerialize() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("serializedobject.txt"));
			Student s = (Student) in.readObject();
			System.out.println(s.id + " " + s.name);

			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Student implements Serializable {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}