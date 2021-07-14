package handson2;

import java.util.Scanner;

public class EnhancedLoop {
	int a[]=new int[5];
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Five nos:");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i:a)
			sum=sum+i;
		System.out.println("The sum of 5 numbers: "+sum);
	}
	public static void main(String[] args) {
		EnhancedLoop enhancedLoop=new EnhancedLoop();
		enhancedLoop.display();
	}
}
