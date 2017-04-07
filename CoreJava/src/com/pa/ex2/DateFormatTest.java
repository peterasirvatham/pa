package com.pa.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Date now = new Date();

		// Use SimpleDateFormat
		//EEE stands for day of week
		SimpleDateFormat simpleFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(simpleFormatter.format(now));
		
	}
}