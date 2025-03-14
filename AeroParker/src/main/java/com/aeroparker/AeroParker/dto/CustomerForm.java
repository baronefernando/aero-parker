package com.aeroparker.AeroParker.dto;

public class CustomerForm {

    private String emailAddress;
    private String title;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postcode;
    private String phoneNumber;

    // Getters and Setters

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
