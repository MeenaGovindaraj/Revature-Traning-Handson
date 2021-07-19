package handson1;

import java.util.Scanner;

class SingleString
{
	
	public void printString()
	{
		String names[]={"Meena"," harini"," hairtha"," Ilakkiya"," kalai"," arasi" ,"hema"," latha ", " nila"," bharathi"};
		Scanner sc=new Scanner(System.in);
	
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<10;i++)
			sb.append(names[i]);
		String name=sb.toString();
		System.out.println("Single string name:"+name);
	}
}

public class StringBuilderProg {
	public static void main(String[] args) {
	SingleString singleString=new SingleString();
		singleString.printString();
	}

}
