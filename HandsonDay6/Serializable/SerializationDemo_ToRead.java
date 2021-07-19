package iodemos;

import java.io.*;

public class SerializationDemo_ToRead {

	
	public static void main(String[] args){
		readFromFile();
	}

	private static void readFromFile() {
		
		Product product=new Product();
		System.out.println("---object Serialization Prog( To read)");
		
		
		try {
			ObjectInputStream out= new ObjectInputStream
					(new FileInputStream(new File("D:\\product1.csv")));
			product=(Product) out.readObject();
			System.out.println(product);
		} 
		
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		}
		
	}


