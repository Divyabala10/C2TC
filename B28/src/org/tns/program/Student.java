package org.tns.program;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String name = sc.nextLine();
			int age = sc.nextInt();
			int sub1_mark = sc.nextInt();
			int sub2_mark = sc.nextInt();
			int sub3_mark = sc.nextInt();
			int total=sub1_mark+sub2_mark+sub3_mark;
			float average=total/3;
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("sub1_mark: "+sub1_mark);
			System.out.println("sub2_mark: "+sub2_mark);
			System.out.println("sub3_mark: "+sub3_mark);
			System.out.println("Total: "+total);
			System.out.println("Average: "+average);
		}
	}
}