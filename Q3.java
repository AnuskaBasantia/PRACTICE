package problem;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.nextLine();
		String mtr="";
		for(int i=str.length()-1;i>=0;i--)
			mtr=mtr+str.charAt(i);
		{
			if(mtr.equals(str))
				
			{
				System.out.println("yes! the string is palindrome");
			}
			else
			{
				System.out.println("No! the string is not palindrome");
			}
		}
		
		
	}

}
