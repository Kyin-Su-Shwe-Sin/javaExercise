package javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Pleas Enter Array Length : ");
		int arrlength=sc.nextInt();
		
		int[] arr=new int[arrlength];
		
		System.out.print("Please Enter Array Values : ");
		for(int i=0; i<arrlength; i++) {
			arr[i]=sc.nextInt();
		}
		
		float average=average(arr);
		System.out.println("Average Value is "+average);
		
		Arrays.sort(arr);
		System.out.println("Minimum Value is " + arr[0] + " And "+ arr[1]);
		System.out.println("Maximum Value is " + arr[arr.length-1]+ " And "+ arr[arr.length-2]);
	}
	public static float average(int[] input) { 
		float sum = 0f; 
		for (int number : input) { 
			sum = sum + number; 
		} 
		return sum / input.length; 
	}

}
