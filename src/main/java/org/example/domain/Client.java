package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private final int customerId;
    private final List<Movie> bookedMovies;

    public Client(String name, int age, int customerId) {
        super(name, age);
        this.customerId = customerId;
        this.bookedMovies = new ArrayList<>();
    }

    public void bookMovie(Movie movie) {
        bookedMovies.add(movie);
        System.out.println(name + " booked the movie: " + movie.title());
    }

    @Override
    public String getRole() {
        return "Client name: " + name;
    }

    public String getRole(boolean detailed) {
        if (detailed) {
            return "Client ID: " + customerId;
        }
        return getRole();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Client ID: " + customerId);
        System.out.println("Booked Movies:");
        for (Movie movie : bookedMovies) {
            movie.displayInfo();
        }
    }
}
