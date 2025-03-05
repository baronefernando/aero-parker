package com.aeroparker.AeroParker.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime registered;

    @Column(nullable = false, unique = true)
    private String emailAddress;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String addressLine1;

    private String addressLine2;

    private String city;

    @Column(nullable = false)
    private String postcode;

    private String phoneNumber;

    // Default constructor
    public Customers() 
    {

    }

    public Customers(LocalDateTime registered, String emailAddress, String title, String firstName, String lastName, String addressLine1, String addressLine2, String city, String postcode, String phoneNumber) 
    {
        this.registered = registered;
        this.emailAddress = emailAddress;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public LocalDateTime getRegistered() 
    {
        return registered;
    }

    public void setRegistered(LocalDateTime registered) 
    {
        this.registered = registered;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getAddressLine1() 
    {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) 
    {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() 
    {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) 
    {
        this.addressLine2 = addressLine2;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getPostcode() 
    {
        return postcode;
    }

    public void setPostcode(String postcode) 
    {
        this.postcode = postcode;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
}
