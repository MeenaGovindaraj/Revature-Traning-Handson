package handson1;

import java.util.Scanner;

public class LargestNumber {

	public void display() {
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		System.out.println("Enter num2:");
		num2 = sc.nextInt();
		System.out.println("Enter num3:");
		num3 = sc.nextInt();
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("Hey!!!,it me Num1 , I am the greatest:)");
			} else {
			if (num3 > num2)
				System.out.println("Hey!!!,it me Num3 , I am the greatest:)");
			}
		} else if (num2 > num3)
			System.out.println("Hey!!!,it me Num2 , I am the greatest:)");
		else
			System.out.println("Hey!!!,it me Num3 , I am the greatest:)");
	}

	public static void main(String[] args) {
		LargestNumber number = new LargestNumber();
		number.display();
	}
}
