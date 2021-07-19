package handson1;

import java.util.Scanner;

class StringFuns {
	public void display() {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Please Enter the String");
		s=sc.nextLine();
		System.out.println("Given String is: " +s);
		
		System.out.println("1. "+s.charAt(12));
		
		System.out.println("2. "+s.contains("is"));
		
		System.out.println("3. "+s.concat(" and killed it"));
		
		System.out.println("4. "+s.endsWith("dogs"));
		
		System.out.println("5. "+s.equals("The quick brown Fox jumps over the lazy Dog"));
		
		System.out.println("6. "+s.equalsIgnoreCase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println("7. "+s.length());
		
		System.out.println("8. "+s.matches("The quick brown Fox jumps over the lazy Dog"));
		
		System.out.println("9. "+s.replaceAll("the","A"));
		
		
		String[] splitanimal = s.split("jumps");
		System.out.println("10. "+splitanimal[0]+"\n"+splitanimal[1]);
	
		System.out.print("11. ");
		s.contains("fox");
		System.out.print("Animals are: fox,");
		s.contains("dog");
		System.out.println("dog");
			
		 
		 System.out.println("12. "+s.toLowerCase());
		 
		 System.out.println("13. "+s.toUpperCase());
		 
		 System.out.println("14. "+s.indexOf('a'));
		 
		 System.out.println("15. "+s.lastIndexOf('e'));
		 
		 
	}
	
}

public class StringFunctionsProg {
	public static void main(String[] args) {
		StringFuns funs=new StringFuns();
		funs.display();
	}
}
