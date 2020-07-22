package javaTest;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter a Number : ");
		int no=sc.nextInt();
		
		int result=1;
		for(int i=1; i<= no; i++) {
			result *= i;
		}
		System.out.println("Factorial Number of "+no+" is "+result);
	}

}
