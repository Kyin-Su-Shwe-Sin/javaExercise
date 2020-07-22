package javaTest;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please Enter a String : ");
		String str=sc.nextLine();
		
		String output = ""; 
		Scanner lineScan = new Scanner(str); 
        while(lineScan.hasNext()) {
            String word = lineScan.next(); 
            output += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
     System.out.println(output.trim()); 
	}

}
