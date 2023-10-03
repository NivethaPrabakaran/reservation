package busRes;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
public class BusDemo {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,35));
        buses.add(new Bus(3,true,60));
        int userOpt = 1;
        Scanner scan = new Scanner(System.in);
        for (Bus b : buses) {
            b.displayBusInfo();
        }
        while (userOpt == 1) {
            System.out.println("Enter 1 to book and 2to exit");
            userOpt = scan.nextInt();
            if (userOpt == 1) {
                Booking booking = new Booking();
               if(booking.isAvailable(bookings,buses)){
                   bookings.add (booking);
                   System.out.println("your booking is confirmed");
               }
               else
                   System.out.println("sorry the bus is full,try another bus or date");
            }
        }
    }
}
