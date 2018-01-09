import java.util.Scanner;

public class Taskone {

	public static void main(String[] args) {
		String input;
		Scanner s=new Scanner(System.in);
		input = s.next();
		boolean valid=true;
		String alpha = "(.*[a-zA-Z].*)";
		if(input.length()<8)
		{
			System.out.println("Should contain 8 characters");
			valid=false;
		}
		if(!input.matches(alpha))
		{
			System.out.println("Should contain one alphabet");
			valid=false;
		}
		String numeric = "(.*[0-9].*)";
		if(!input.matches(numeric))
		{
			System.out.println("Should contain one number");
			valid=false;
		}
		if(valid)
		{
			System.out.println("Password Accepted");
		}
	}
}
