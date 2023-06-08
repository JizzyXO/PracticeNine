import task_one.ArraySurfer;
import task_two.AirTicket;
import task_two.Hotel;
import task_two.Tour;

public class Main {
    public static void main(String[] args) {
        
        ArraySurfer<String> arraySurfer = new ArraySurfer<>();
        arraySurfer.add("Element 1");
        arraySurfer.add("Element 2");
        arraySurfer.add("Element 3");
        System.out.println("ArraySurfer: " + arraySurfer);


        AirTicket departureTicket = new AirTicket("10:00", "City A", "12:00", "City B");
        AirTicket returnTicket = new AirTicket("14:00", "City B", "16:00", "City A");
        Hotel hotel = new Hotel("Hotel XYZ", "Country X", "City Y", 5, "Luxury");
        Tour tour = new Tour(departureTicket, returnTicket, hotel);
        tour.printTourDetails();
    }
}
