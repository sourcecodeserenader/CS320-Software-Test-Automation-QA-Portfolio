package com.project;

public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
        if (contactId == null || contactId.length() > 10) throw new IllegalArgumentException();
        if (firstName == null || firstName.length() > 10) throw new IllegalArgumentException();
        if (lastName == null || lastName.length() > 10) throw new IllegalArgumentException();
        if (phoneNumber == null || phoneNumber.length() != 10) throw new IllegalArgumentException();
        if (address == null || address.length() > 30) throw new IllegalArgumentException();

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getContactId() { return contactId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { if (firstName != null && firstName.length() <= 10) this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { if (lastName != null && lastName.length() <= 10) this.lastName = lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { if (phoneNumber != null && phoneNumber.length() == 10) this.phoneNumber = phoneNumber; }
    public String getAddress() { return address; }
    public void setAddress(String address) { if (address != null && address.length() <= 30) this.address = address; }
}
