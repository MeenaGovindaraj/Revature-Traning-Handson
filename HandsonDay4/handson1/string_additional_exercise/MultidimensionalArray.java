package handson1;

import java.util.Scanner;

public class MultidimensionalArray {
	int row = 0, col = 0, row1, col1;
	Scanner sc = new Scanner(System.in);

	public void displaySum() {

		int i, j;
		System.out.println("Enter array1 row and col size");
		row = sc.nextInt();
		col = sc.nextInt();
		System.out.println("Enter array2 row and col size");
		row1 = sc.nextInt();
		col1 = sc.nextInt();
		int a[][] = new int[row][col];
		int b[][] = new int[row1][col1];
		int sum[][] = new int[row][col1];
		System.out.println("Enter the array 1 element of size 5");

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the array 2 element of size 5");

		for (i = 0; i < row1; i++) {
			for (j = 0; j < col1; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array1");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nArray2");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col1; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nThe sum of two matrices:");

		for (i = 0; i < row; i++) {
			for (j = 0; j < col1; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
	for(i=0;i<row;i++)
	{
		for (j = 0; j < col1; j++) {
			System.out.print(sum[i][j] + " ");
		}
		System.out.println();
	}
	}
	public static void main(String[] args) {

		MultidimensionalArray array = new MultidimensionalArray();
		array.displaySum();

	}

}
