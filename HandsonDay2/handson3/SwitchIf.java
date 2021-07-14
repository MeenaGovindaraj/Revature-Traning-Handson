package handson3;

import java.util.Scanner;

public class SwitchIf {
	int day,month,year;
	public void display()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Day:");
		day=sc.nextInt();
		System.out.println("Enter Month:");
		month=sc.nextInt();
		System.out.println("Enter Year:");
		year=sc.nextInt();
		int check=0;
	
		if(year>=1990 && year<1995 )
			check=1;
		else if(year>=1995 && year<2000)
			check=2;
		else if(year>=2000 && year<2010)
			check=3;
		else if(year>=2010 && year<=2021)
			check=4;
		else
			check=5;
	
	switch(check)
	{
	
	case 1:
		System.out.println("You are early 90's born");
		break;
	case 2:
		System.out.println("You are late 90's born");
		break;
	case 3:
		System.out.println("You are new decade born");
		break;
	case 4:
		System.out.println("You are recently born");
		break;
	default:
			System.out.println("Invalid year");
			break;
	}
	}
	public static void main(String[] args) {
		SwitchIf if1=new SwitchIf();
		if1.display();

	}

}
