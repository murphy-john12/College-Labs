package ie.itcarlow.Lab3;

import java.util.Calendar;

//Driver program to test the Time class.
public class Clock
{
	public static void main (String args[])
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));;
		
		long currSecond = System.currentTimeMillis();
		long currMin = t.getMinute();
		int endMin = t.getMinute() + 1;
				
		while(currMin != endMin) {
			if(System.currentTimeMillis() == (currSecond+1000))
			{
				currSecond = System.currentTimeMillis();
				t.tick();
				System.out.println(t.toString());
			}
			currMin = t.getMinute();
		}
	}
}