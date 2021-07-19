package com.compartor.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class paymentCheck {

	public static void main(String[] args) {

		List<Payment> payment = new ArrayList<Payment>();

		payment.add(new Payment(1, "CASH", 1000, "Success"));
		payment.add(new Payment(2, "GPAY", 3000, "failure"));
		payment.add(new Payment(3, "PHONEPAY", 20000, "Pending"));
		payment.add(new Payment(4, "DEBIT CARD", 50000, "Success"));
		payment.add(new Payment(5, "CASH", 5000, "Success"));

		System.out.println("0. Initial Stage");
		System.out.println(payment);

		int op = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your option");
		System.out.println("1. Sort by PAYMENT ID");
		System.out.println("2. Sort by PAYMENT TYPE");
		System.out.println("3. Sort by PAYMENT AMOUNT");
		System.out.println("4. Sort by PAYMENT STATUS");
		System.out.println("5. EXIT");
		// op=sc.nextInt();
		while (op != 5) {
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Sort by PAYMENT ID");
				Collections.sort(payment, new Comparator<Payment>() {

					@Override
					public int compare(Payment o1, Payment o2) {
						if (o1.getPaymentId() > o2.getPaymentId())
							return 1;
						else
							return -1;
					}
				});

				System.out.println(payment);
				break;
			case 2:
				System.out.println("Sort by PAYMENT TYPE");
				Collections.sort(payment);
				System.out.println(payment);
				break;
			case 3:
				System.out.println("Sort by PAYMENT AMOUNT");
				Collections.sort(payment, new amountComparator());
				System.out.println(payment);
				break;
			case 4:
				System.out.println("Sort by PAYMENT STATUS");
				Collections.sort(payment, new Comparator<Payment>() {

					@Override
					public int compare(Payment o1, Payment o2) {
						if (o1.getStatus().compareTo(o2.getStatus()) > 0)
							return 1;
						else
							return -1;
					}

				});
				System.out.println(payment);
				break;
			case 5:
				System.out.println("Thanks :) ");
				System.out.println("EXIT");
				break;
			default:
				System.out.println("Enter valid no");
				break;

			}
			System.out.println("\nEnter the option:");

		}

	}
}
