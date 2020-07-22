package javaTest;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter a String : ");
		String str=sc.nextLine();
		
		System.out.print("Please Enter Remove Index : ");
		int index=sc.nextInt();
		
		String result=removeChar(str, index);
		System.out.println(result);
		
//		System.out.println(str.substring(0,index)+str.substring(index+1));
		
		sc.close();
	}
	public static String removeChar(String s, int i) {
		return s.substring(0,i)+s.substring(i+1);
	}

}
