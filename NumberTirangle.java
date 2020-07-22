package javaTest;

public class NumberTirangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5, result=1;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(result + "\t");
				result++;
			}
			System.out.println();
		}
	}

}
