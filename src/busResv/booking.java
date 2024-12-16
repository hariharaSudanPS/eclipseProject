package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
	String passengerName;
	int busNo;
	Date date;
	
	booking(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("ENTER NAME OF PASSENGER:");
		passengerName = scanner.next();
		System.out.println("ENTER THE NAME NUMBER:");
		busNo= scanner.nextInt();
		System.out.println("ENTER  DATE (dd-mm-yyyy):");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<booking> bookings , ArrayList<Bus> buses) {
		int capcity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo()== busNo)
				capcity = bus.getCapcity();		
			}
		int booked=0;
		for(booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capcity?true:false;
}
}