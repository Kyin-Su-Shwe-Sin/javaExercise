package javaTest;

public class Homework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print(i*j +"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		for(int i=1; i<=100; i++) {
			
				System.out.print(i+"\t");
			if(i%10 == 0) {
				System.out.println();
			}
			
		}
	}

}
