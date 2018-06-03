public class Clock implements Comparable
{
public int compareTo(Object otherClock)
{
	Clock temp = (Clock) otherClock;
	
	int hrDiff = hr - temp.hr;
	if (hrDiff != 0)
		return hrDiff;
		
	int minDiff = min - temp.min;
	if (minDiff != 0)
		return hrDiff;
		
	return sec - temp.sec;
}

public boolean equals (Object otherClock)
{
	Clock temp = (Clock) otherClock;
	
	return (hr == temp.hr && min == temp.min && sec == temp.sec);
}
}//Close Clock Class
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
		
			
			
			
		
		
	
	
			