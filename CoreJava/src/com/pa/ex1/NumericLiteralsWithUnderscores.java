package com.pa.ex1;

public class NumericLiteralsWithUnderscores {

	
	public static void main(String[] arg) {
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 	3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println("Credit Card No :"+creditCardNumber);
		System.out.println("Social Security No :"+socialSecurityNumber);
		System.out.println("PI value :"+pi);
		System.out.println("hexBytes Value :"+hexBytes);
		System.out.println("hexWords Value :"+hexWords);
		System.out.println("maxLong Value :"+maxLong);
		System.out.println("nybbles value :"+nybbles);
		System.out.println("bytes value :"+bytes);
	}
}
