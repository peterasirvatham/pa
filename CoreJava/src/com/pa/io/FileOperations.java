package com.pa.io;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] a) {
		FileOperations fo = new FileOperations();
		fo.fileMethodGoThrough();
		fo.examineDirectory();
	}

	private void examineDirectory() {
		File file = new File("D:/Peter/");
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);
		}
	}

	private void fileMethodGoThrough() {

		try {
			File file = new File("MyTestFile2.txt");
			// Tests whether the application can read the file
			System.out.println(file.canRead());
			// Tests whether the application can modify the file
			System.out.println(" -- " + file.canWrite());
			// Tests whether the application can modify the file
			System.out.println(file.createNewFile());
			// Deletes the file or directory
			// System.out.println(file.delete());
			// Tests whether the file or directory exists.
			System.out.println(file.exists());
			// Returns the absolute pathname string.
			System.out.println(file.getAbsolutePath());
			// Tests whether the file is a directory or not.
			System.out.println(file.isDirectory());
			// Tests whether the file is a hidden file or not.
			System.out.println(file.isHidden());
			// Returns an array of strings naming the
			// files and directories in the directory.
			System.out.println(file.list());
		} catch (IOException ex) {

		}
	}
}
