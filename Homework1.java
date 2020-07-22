package javaTest;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter a String : ");
		String str=sc.nextLine();
//		System.out.println("Your String is : "+str);
		char last=str.charAt(str.length()-1);
//		System.out.println(last);
		System.out.println(last+str+last);
	}

}
