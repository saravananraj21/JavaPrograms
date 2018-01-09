import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputstr=s.nextLine();
		int length=inputstr.length();
		int width=s.nextInt();
		System.out.println(inputstr.substring(length-width, length));
		System.out.println(inputstr.substring(0, width));
	}

}
