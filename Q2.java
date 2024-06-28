package problem;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a gmail ID");
		String str=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(((str.charAt(i)>=97&&str.charAt(i)<=122)||(str.charAt(i)>=48&&str.charAt(i)<=57))||(str.charAt(i)=='.'||str.charAt(i)=='_'||str.charAt(i)=='$'))
			{
				c++;
			}
		}
		if(str.endsWith("@gmail.com"))
		{
			c++;
		}
		if (c==str.length())
		{
			System.out.println("email is in correct format");
		}
		else
		{
			System.out.println("email is not in correct format");
		}

	}

}
