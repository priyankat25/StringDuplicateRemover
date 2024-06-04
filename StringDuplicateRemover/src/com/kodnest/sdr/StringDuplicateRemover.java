package com.kodnest.sdr;

import java.util.Scanner;

public class StringDuplicateRemover {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		
		String res = removeConsecutiveDuplicates(inputString);
		System.out.println("Removed duplicates: " + res);
	}
	
	public static String removeConsecutiveDuplicates(String inputString) {
		String str = inputString.charAt(0) + "";
		for(int i=1; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			char c = inputString.charAt(i-1);
			if(ch == c) {
				continue;
			}
			else {
				str = str + ch;
			}			
		}
		return str;
	}
}