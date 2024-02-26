package javaproject;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time of working at job in minutes");
		int minutes=sc.nextInt();
		int hours=minutes/60;
		int minute=minutes%60;
		System.out.println("enter time in hour and minute will be"+"hours"+"minutes");
	}

}
