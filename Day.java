import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
/* Logic used
   Key value method in the below link
   http://mathforum.org/dr.math/faq/faq.calendar.html*/
public class Day {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int month = s.nextInt();
		int date = s.nextInt();
		int year = s.nextInt();
		int p1 = (year%100)/4;
		int monthcode[]={1,4,4,0,2,5,0,3,6,1,4,6};
		int yearcode=0;
		int p2=monthcode[month-1];
		//This part is to check whether the year is leap year or not
		boolean flag=false;
		if(year%400==0)
			flag=true;
		else if(year%100==0)
			flag=false;
		else if(year%4==0)
			flag=true;
		else
			flag=false;
		if(flag==true && (month == 1 || month ==2))
		{
			p2=p2-1;
		}
		if(year>=1700&&year<=1799)
		{
			yearcode = 4;
		}
		if(year>=1800&&year<=1899)
		{
			yearcode = 2;
		}
		if(year>=1900&&year<=1999)
		{
			yearcode = 0;
		}
		if(year>=2000&&year<=2099)
		{
			yearcode = 6;
		}
		int result = (date + p1 + p2 + yearcode + (year%100))%7;
		String daysArr[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		System.out.println(daysArr[result-1]);
	}

}
