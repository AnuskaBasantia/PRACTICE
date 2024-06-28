package problem;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		System.out.println("Uppercase: " +str.toUpperCase());
		System.out.println("lowercase: " +str.toLowerCase());
		System.out.println("replace: " +str.replace('n','o'));
		System.out.println("StartsWith: "+str.startsWith("an"));
		System.out.println("EndsWith "+str.endsWith("s"));
		System.out.println("Index: " +str.indexOf('a'));
		System.out.println("Length: " +str.length());
		System.out.println("Concat: "+str.concat("basantia"));
		System.out.println("Equals: " +str.equals("khusi"));
	}

}
