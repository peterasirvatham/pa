package com.pa.io;

import java.io.File;

public class DirectoryDemo {
	   public static void main(String a[]){
	        File file = new File("D:/eclipse/");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
}
