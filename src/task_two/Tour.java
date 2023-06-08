package task_two;

public class Tour {
    private AirTicket departureTicket;
    private AirTicket returnTicket;
    private Hotel hotel;

    public Tour(AirTicket departureTicket, AirTicket returnTicket, Hotel hotel) {
        this.departureTicket = departureTicket;
        this.returnTicket = returnTicket;
        this.hotel = hotel;
    }

    public void printTourDetails() {
        System.out.println("Departure Ticket:");
        departureTicket.printTicketDetails();

        System.out.println("\nReturn Ticket:");
        returnTicket.printTicketDetails();

        System.out.println("\nHotel Details:");
        hotel.printHotelDetails();
    }
}
