package task_two;

public class AirTicket {
    private String departureTime;
    private String departurePlace;
    private String arrivalTime;
    private String arrivalPlace;

    public AirTicket(String departureTime, String departurePlace, String arrivalTime, String arrivalPlace) {
        this.departureTime = departureTime;
        this.departurePlace = departurePlace;
        this.arrivalTime = arrivalTime;
        this.arrivalPlace = arrivalPlace;
    }

    public void printTicketDetails() {
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Departure Place: " + departurePlace);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Arrival Place: " + arrivalPlace);
    }
}

