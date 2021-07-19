package iodemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {

		FileReader reader = null;
		try {
			File file = new File("D:\\coursera.txt");

			if (file.exists()) {
				reader = new FileReader(file);
				int i = 0;
				while ((i = reader.read()) != -1) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("No file");
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
