package com.addressbook;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    /**
     * default constructor
     */
    public Contact() {
    }

    /**
     * parametrised constructor to initialise with given values
     * @param firstName   of person
     * @param lastName    of person
     * @param address     of person
     * @param city        of person
     * @param state       of person
     * @param zip         of person
     * @param phoneNumber of person
     * @param email       of person
     */
    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
