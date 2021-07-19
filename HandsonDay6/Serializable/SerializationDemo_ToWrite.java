package iodemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo_ToWrite {

	public static void main(String[] args) {
		toWriteFile();
	}

	private static void toWriteFile() {
		
		System.out.println("----Object serialization prog( To write )");
		Product product=new Product(1,"IPHONE",9,100000);
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(new File("D:\\product.csv"))) ;
			out.writeObject(product);
			System.out.println("Saved successfully");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
