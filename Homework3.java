package javaTest;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter a String : ");
		String str=sc.nextLine();
		
		char start = str.charAt(0);
	    char end = str.charAt(str.length() - 1);
	    
	    System.out.print(end);
	    for(int i=1; i<str.length()-1; i++) {
	    	System.out.print(str.charAt(i));
	    }
	    System.out.print(start);
	}

}
