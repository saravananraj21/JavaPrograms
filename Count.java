import java.util.Arrays;
import java.util.Scanner;
/*Logic Used
  To find the occurrence of the substring in the original string count the no of times each character in the substring has occurred in the
  input string and store it in an array.The smallest value in the array will be the occurrence of the substring in the given string  */
public class Count {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String inputstr = s.nextLine();
		String substr = s.nextLine();
		char inputstrArr[]=inputstr.toCharArray();
		char substrArr[]=substr.toCharArray();
		int countArr[]=new int[substr.length()];
		int count;
		for(int i=0;i<substr.length();i++) //This loop has the count of each character in the substring in an integer array countArr[]
		{
			count=0;
			for(int j=0;j<inputstr.length();j++)
			{
				if(substrArr[i]==inputstrArr[j])
				{
					count=count+1;
				}
			}
			countArr[i]=count;
		}
		Arrays.sort(countArr);
		System.out.println(countArr[0]);
		
	}

}
