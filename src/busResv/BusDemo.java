package busResv;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<booking>bookings = new ArrayList<booking>();
		
		buses.add(new Bus(4310,true,2));
		buses.add(new Bus(4301,false,55));
		buses.add(new Bus(4312,true,45));
		buses.add(new Bus(4304,false,60));
		buses.add(new Bus(4305,false,58));
		buses.add(new Bus(4316,true,45));
		
		
		int userOpt=1;
		Scanner sc = new Scanner(System.in); 
		
		for(Bus b : buses) {
			b.displayBusinfo();
		}
		while(userOpt==1) 
		{
			System.out.println("enter '1' to book and '2' to exit");
			userOpt=sc.nextInt();
				if(userOpt==1) 
				{
					booking Booking = new booking();
					if(Booking.isAvailable(bookings,buses)) 
					{
						bookings.add(Booking);
						System.out.println("your booking is confirmed");
						
					}
					else {
						System.out.println("sorry. Bus is full. Try another bus or date.");
					}
				}
		

	}

}
}
