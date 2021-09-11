package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";

		String text2 = "potss";

		if (text1.length() == (text2.length())) {
			System.out.println("Strings are equal");

			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an Anagram");
			}

		}
	}

}
