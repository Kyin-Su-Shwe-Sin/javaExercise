package javaTest;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter a Number : ");
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i+=2) {
			System.out.print(str.substring(i,i+2)+", ");
		}
	}

}
