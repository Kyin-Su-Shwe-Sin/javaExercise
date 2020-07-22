package javaTest;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter a String : ");
		String str=sc.nextLine();
		
//		for(int i=0; i<=2; i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.print(str);
//		for(int i=0; i<=2; i++) {
//			System.out.print(str.charAt(i));
//		}
		
		System.out.println(str.substring(0,3)+str+str.substring(0,3));
	}

}
