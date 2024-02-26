package javaproject;

import java.util.Scanner;

public class Egg_market {

	public static void main(String[] args) {
		System.out.println("welcome to the Egg market");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of eggs");	
		int egg=sc.nextInt();
		int dozen=egg/12;
		int eggs = egg%12;
		System.out.println("You enter the eggs are " +dozen+ " dozen " +eggs+ " eggs.");
		float eggprice=8*egg;
		System.out.println("total price of the egg "+eggprice);
		if(egg>=2) 
		{
			double discount=eggprice*(0.02);
	        double finalprice=eggprice-discount;
			System.out.println("After Discount " +finalprice);
		}
		else if (egg>=5)
		{
			double dis = eggprice*.03;
			double fp= eggprice-dis;
			System.out.println("After Discount " +fp);
		}
		else
		{
			double di = eggprice * .05;
			double fpr = eggprice - di;
			System.out.println("After Discount " +fpr);
					
		}
	}

}
