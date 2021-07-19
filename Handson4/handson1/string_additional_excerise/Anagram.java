package handson1;

import java.util.Arrays;
import java.util.Scanner;

class AnagramCheck {
	public void check(String s1, String s2) {
		int flag;

		if (s1.length() != s2.length()) {
			System.out.println("Strings are not anagram");
			return;
		}

		else {

			flag = 1;
			char[] c1 = s1.toCharArray();
			Arrays.sort(c1);
			s1 = new String(c1);

			System.out.println(s1);
			char[] c2 = s2.toCharArray();
			Arrays.sort(c2);
			s2 = new String(c2);
			System.out.println(s2);
			for (int i = 0; i < s1.length(); i++)

				if (s1.equals(s2)) {

				} else {
					flag = 0;
					break;
				}
		}
		if (flag == 1)
			System.out.println("Anagram ? : Yes");
		else
			System.out.println("Anagram ? : No");
	}
}

public class Anagram {

	public static void main(String[] args) {
		AnagramCheck check = new AnagramCheck();
		Scanner s = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter string 1:");
		s1 = s.nextLine();
		System.out.println("Enter string 2:");
		s2 = s.nextLine();
		s1 = s1.replace(" ", "");
		s1 = s1.replaceAll("\\p{Punct}", "");

		s2 = s2.replace(" ", "");
		s2 = s2.replaceAll("\\p{Punct}", "");
		// System.out.println(s1);
		// System.out.println(s2+"\n");

		check.check(s1, s2);

	}

}
