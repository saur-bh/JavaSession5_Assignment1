package com.acadglid.com;

public class child extends Assignment1{


	void methodOne() {

		System.out.println("method implementation requires in extended child class" );
	}

	public static void main(String[] arg) {

		child obj = new child();  // obj of child class can only be created

		// Assignment1 obj1 = new Assignment1(); This will be giving error, as abstract class can not be initiated.

		Assignment1.methodTwo(); // Make method static to be initiated. 

		obj.methodOne(); // method define in parent (Assignment1) is implemented and initiated.

		child.methodTwo(); 

	}

}
