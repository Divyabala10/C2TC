package org.tns.program;

import java.util.Scanner;

public class light_on_off {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the hour");
				int hour = sc.nextInt();
				if(hour >0 && hour < 6) {
					System.out.println("Its sleeping time");
				}
				else if(hour>6 && hour <18) {
					System.out.println("Switch off the light");
				}
				else
					System.out.println("Switch on the light");
	}
}

