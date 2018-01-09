import java.util.Arrays;
import java.util.Scanner;
/*Logic Used
  AS it is case insensitive we have to convert the given strings into either uppercase or 
  lowercase.Here i have converted to lowercase and converted into char array.After that i 
  have sorted both the arrays.If both the arrays are equal then it is anagram else it is not*/
public class RegularExp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputstr = s.nextLine();
		inputstr=inputstr.toLowerCase();
		String strtofind = s.nextLine();
		strtofind=strtofind.toLowerCase();
		char inputstrArr[]=inputstr.toCharArray();
		char strtofindArr[]=strtofind.toCharArray();
		Arrays.sort(inputstrArr);
		Arrays.sort(strtofindArr);
	    if(Arrays.equals(inputstrArr,strtofindArr))
	    {
	    	System.out.println("Anagrams");
	    }
	    else
	    {
	    	System.out.println("Not Anagrams");
	    }
		
	}

}
