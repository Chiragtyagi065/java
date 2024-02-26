package javaproject;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("find the triangle angles");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		if(s1==s2 && s1==s3)
			System.out.println("triangle is equilaterial");
		else if(s1==s2 || s1==s3|| s2==s3)
			System.out.println("isoceles");
		else
		{
			System.out.println("scalene");
		}
			
		
	}
	

}
