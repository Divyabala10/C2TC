package org.tns.program;
import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the days you returned late");
			int days = sc.nextInt();
			if(days<5) {
				System.out.println("The fine is "+days*1);
			}
			else if((days>5)&&(days<10)) {
				System.out.println("The fine is "+days*5);
				
			}
			else {
				System.out.println("The fine is "+days*10);
			}
	}
}
