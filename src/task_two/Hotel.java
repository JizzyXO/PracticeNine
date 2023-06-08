package task_two;

import java.util.Random;

public class Hotel {
    private String name;
    private String country;
    private String city;
    private int starRating;
    private String roomClass;

    public Hotel(String name, String country, String city, int starRating, String roomClass) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.starRating = starRating;
        this.roomClass = roomClass;
    }

    public void printHotelDetails() {
        System.out.println("Hotel Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Star Rating: " + starRating);
        System.out.println("Room Class: " + roomClass);
    }
}

