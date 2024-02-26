package javaproject;

import java.util.Scanner;

public class whiledemo {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int rev=0;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n/=10;
		}
		if(t==rev)
			System.out.println("palandrom");
		else
			System.out.println("not");
	}

}
