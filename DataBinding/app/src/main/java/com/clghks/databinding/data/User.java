package com.clghks.databinding.data;

/**
 * Created by chihwan on 15. 11. 9..
 */
public class User {
    private final String firstName;
    private final String lastName;
    private final boolean isAdult;

    public User(String firstName, String lastName, boolean isAdult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdult = isAdult;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public boolean isAdult() {
        return isAdult;
    }
}