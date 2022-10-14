package org.tns.program;
import java.util.Scanner;


public class multiples {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int number = sc.nextInt();
			if(number % 3 == 0) {
				System.out.println(number +"is a multiples of 3");
				}
			else {
				System.out.println(number +"is not a multiples of 3");
			}
		}

	}

}
