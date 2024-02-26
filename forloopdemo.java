package javaproject;

import java.util.Scanner;

public class forloopdemo {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int fact=1;
		for(int i =1;i<=n;i++)
		{
			//if(i%5==0)
			//System.out.println(i);
			fact*=i;
		}
		System.out.println(fact);

	}

}
