package org.example.domain;

/**
 * @param duration Duration in minutes
 */
public record Movie(String title, int duration) {

    public void displayInfo() {
        System.out.println("Movie Title: " + title + ", Duration: " + duration + " minutes");
    }
}
