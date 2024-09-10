package org.example;

import org.example.domain.Client;
import org.example.domain.Employee;
import org.example.domain.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie("Shrek", 0);

        // Create customers and book movies
        Client client = new Client("John Galt", 1, 1);
        client.bookMovie(movie1);

        // Create cinema employees
        Employee employee = new Employee("Emilie Clark", 2, 2, "Staff");

        // Display information
        System.out.println("--- Client Info ---");
        client.displayInfo();

        System.out.println("\n--- Employee Info ---");
        employee.displayInfo();

        // Demonstrating overloaded method
        System.out.println("\n--- Detailed Roles ---");
        System.out.println(client.getRole());
        System.out.println(employee.getRole(true));
    }
}