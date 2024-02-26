package javaproject;

import java.util.Scanner;

public class floorspace {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length and width");
		int length=sc.nextInt();
		int width=sc.nextInt();
		int area=length*width;
		System.out.println("the floor space is"+area);
		
		
		
	}

}
