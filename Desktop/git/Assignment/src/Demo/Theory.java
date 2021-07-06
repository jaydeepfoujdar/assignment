package Demo;

import java.util.Scanner; 

public class Theory {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);  
	    System.out.print("1. Difference between Abstract class and interfaces\n"
	    		+ "2. Method overriding\n"
	    		+ "3. Method overloading\n"
	    		+ "4. Difference between method and constructor\n"
	    		+ "5. CallbyRef and CallByValue\n"
	    		+ "6. String management in Memory\n"
	    		+ "\nEnter desired number: ");  
	    int i = sc.nextInt();
	    sc.close();

	

		switch(i) {
		case 1: 
		      Q1 q1 = new Q1();
		      break;
		case 2:
		      Q2 q2 = new Q2();
		      break;
		case 3:
		      Q3 q3 = new Q3();
		      break;
		case 4:
		      Q5 q4 = new Q5();  
		      break;
		case 5:
		      Q6 q6 = new Q6();
		      break;
		case 6:
		      Q7 q7 = new Q7();
		      break;
		
		
	 }
	}

 }


class Q1{
	Q1() {
	System.out.print("Abstarct class is partial abstraction as it can have concrete methods as well\n"
			+ "		  Interface is full abstraction as it has only abstract methods\\n\n"
			+ "	\n"
			+ "		  Abstarct class can have access modifiers\n"
			+ "		  Interface has all methods as public\n"
			+ "	\n"
			+ "		  Abstract class can extend only one class\n"
			+ "		  Interface can extend multiple interfaces\n"
			+ "					\n"
			+ "		  For abstract class keyword used is extends\n"
			+ "		  For interface keyword used is implements \n"
			+ "					");
	}
}

class Q2{
	Q2() {
	System.out.print("It allows a child class to provide its own implementation of the methods which are already provided by the parent class\\n\n"
			+ "	In overriding, the method name, parameters and return type must be the same\\n\n"
			+ "	Child class can increase the visibility but cannot decrease it	");
		
	}
}

class Q3{
	Q3() {
		System.out.print("A class can have multiple methods of same name but their parameters can be different\\n\n"
				+ "	Advantage is, it provides polymorphism ");
	}
}

class Q5{
	Q5() {
		System.out.print("	Constructor does not have a return type\n"
				+ "	Method can have a return type\n"
				+ "	\n"
				+ "	Constructor is invoked by default if there is no explicit mention\n"
				+ "	Method cannot be invoked by default");
 
	}
	
}

class Q6{
	Q6() {
		System.out.print("In call by value, a copy or clone of the variable is passed and changes take place on the copy variable\n"
				+ "	In call by reference, the actual variable is passed");
  }
	
}

class Q7{
	Q7() {
		System.out.print("When we use string in literal form, it is stored in the string pool where a common object is made for multiple declarations of the same string\n"
				+ "	And when we use in object way, every time new object is created in the heap memory\n"
				+ "	");
  }
	
}



