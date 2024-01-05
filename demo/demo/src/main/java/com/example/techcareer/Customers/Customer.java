package com.example.techcareer.Customers;

public class Customer {
    private String type; // "Individual" or "Corporate"
    private String name;
    private String contactNumber;

    public Customer(String type, String name, String contactNumber) {
        this.type = type;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
