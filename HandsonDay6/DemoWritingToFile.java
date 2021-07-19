package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class DemoWritingToFile {

	public static void writeToFile()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Please enter some Quotes");
		str=sc.nextLine();
		FileWriter fw=null;
		
	try {
		
			fw=new FileWriter("D:\\records.txt");
				fw.write(str);
			System.out.println("successfully written");
			fw.close();
			
	} 
		catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
	
	public static void readFromFile()
	{
		FileReader reader=null;
		try {
			File file=new File("D:\\records.txt");
			reader=new FileReader(file);
			int i=0;
			while((i=reader.read())!=-1)
					{
						System.out.print((char)i);
					}
			
			
			
	} 
		catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	
	}
	}
	
		
	

	public static void main(String[] args) {
		DemoWritingToFile d=new DemoWritingToFile();
		d.writeToFile();
		d.readFromFile();
	}

}
