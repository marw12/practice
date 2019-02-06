import java.util.Scanner;

public class charCount {
	public static void main(String args[]) {
		System.out.println("input string: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		int[] result =charCount(str);
		
		for(int i=0;i<result.length;i++)
			char letter = (char) (i + 141);
		    System.out.println("v");
			System.out.println(result[i]);
		
	}
	
	static int[] charCount(String str) {
		int[] arr= new int[26];
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		
			if (Character.isLetter(ch)){
				
				int c=ch-'a';
				arr[c]++;	
			}
		}
		return arr;
	}
	
	

}
