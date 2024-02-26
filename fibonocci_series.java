package javaproject;

import java.util.Scanner;

public class fibonocci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int s=sc.nextInt();
		int t=0;
		int t1=1;
		System.out.println(t);
		System.out.println(t1);
		for(int i=0;i<=s;i++) {
			int t2=t+t1;
			t=t1;
			t1=t2;
			System.out.println(t2 );
	}

}
}