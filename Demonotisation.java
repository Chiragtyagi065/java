package javaproject;

import java.util.Scanner;

public class Demonotisation {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int amt=sc.nextInt();
		int a,r1000=0,r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
		
		if(amt>=1000) {
			r1000=amt/1000;
			amt	= amt%1000;	
			System.out.println("\ntotal nuber of 1000 rupees notes"+r1000);
			
		}
		if(amt>=500) {
			r500=amt/500;
			amt= amt%500;
			System.out.println("\ntotal number of 500 rupees notes"+r500);
			
		}
		if(amt>=200) {
			r500=amt/200;
			amt= amt%200;
			System.out.println("\ntotal number of 200 rupees notes"+r200);
			

	}
		if(amt>=100) {
			r500=amt/100;
			amt= amt%100;
			System.out.println("\ntotal number of 100 rupees notes"+r100);
			

}
		if(amt>=50) {
			r500=amt/50;
			amt= amt%50;
			System.out.println("\ntotal number of 50 rupees notes"+r50);
			
	}
		if(amt>=20) {
			r500=amt/20;
			amt= amt%20;
			System.out.println("\ntotal number of 20 rupees notes"+r20);
			
}
		if(amt>=10) {
			r500=amt/10;
			amt= amt%10;
			System.out.println("\ntotal number of 500 rupees notes"+r10);
			
	}
		if(amt>=5) {
			r500=amt/5;
			amt= amt%5;
			System.out.println("\ntotal number of 5 rupees notes"+r5);
			
}
		if(amt>=2) {
			r500=amt/2;
			amt= amt%2;
			System.out.println("\ntotal number of 2 rupees notes"+r2);
			
	}
		if(amt>=1) {
			r500=amt/1;
			amt= amt%1;
			System.out.println("\ntotal number of 1 rupees notes"+r1);
			
		
	}
		amt=r1000 +r500+r200+r100+r50+r20+10+r5+r2+r1;
		System.out.println("\n\ntotal number of notes require:\n\n"+amt);
		}
	}
