package javaTest;

public class javaex1 {
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	public static void message() {
		System.out.println("Java Testing Message!");
	}
	public static void minValue(int n1, int n2) {
		if(n1<n2) {
			System.out.println("Minimun number is "+n1);
		}else {
			System.out.println("Minimun number is "+n2);
		}
	}
	public static void gradeTest(char grade) {
		switch(grade) {
		case('A'):System.out.println("Excellent");
		break;
		case ('B'):System.out.println("Good");
		break;
		case('C'):System.out.println("Pass");
		break;
		case ('D'):
		case('E'):System.out.println("Bad");
		break;
		default: System.out.println("This is invalid grade");
		
		}
	}
	
	
	public class Cat{
		public Cat(String name) {
			System.out.println("My name is "+name);
		}
		Cat myCat = new Cat("Pusi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		int result=add(10, 10);
		System.out.println("Adding result is "+result);
		
		javaex1 je= new javaex1();
		int sresult=je.subtract(10, 5);
		System.out.println("Subtract result is "+ sresult);
		
		message();
		
		minValue(7,9);
		minValue(10,5);
		
		gradeTest('A');
		gradeTest('D');
		gradeTest('V');
		
		String name="Kyin Su";
		String fullName;
		fullName = (name == "Kyin Su")? "Shwe Sin": "Kway Kway";
		System.out.println(name + " " + fullName);
		boolean check=name instanceof String;
		System.out.println(check);
		
		
	}

}
