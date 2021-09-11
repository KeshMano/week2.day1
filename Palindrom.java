package week2.day1;

public class Palindrom {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		int l=str.length();
		for(int i=l-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrom");
		}
		else 
			{
				System.out.println("Not a palindrom");
			}
			
		}
	}

		
