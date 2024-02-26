package javaproject;

import java.util.Scanner;

public class markesdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your markes...");
		int marks=sc.nextInt();
		if(marks<=35) 
			System.out.println("failed...");
		else if(marks>=35 && marks<=50) 
			System.out.println("passed with 3rd class");
		else if(marks>=50 && marks<=60) 
			System.out.println("passed with 2nd class");
		else if(marks>=60 && marks<=75) 
			System.out.println("passed with 1st class");
		else if(marks>=75 && marks<=100) 
			System.out.println("passed with distinction");
		else
			System.out.println("out of the range");
	}

}
