package org.codewithsitangshu.data;

public class Address extends Data {

    private String fullAddress;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public String getFullAddress() {
        setFullAddress();
        return this.fullAddress;
    }

    private void setFullAddress() {
        this.fullAddress = faker.address().fullAddress();
    }

    public String getStreetAddress() {
        setStreetAddress();
        return this.streetAddress;
    }

    private void setStreetAddress() {
        this.streetAddress = faker.address().streetAddress();
    }

    public String getCity() {
        setCity();
        return this.city;
    }

    private void setCity() {
        this.city = faker.address().city();
    }

    public String getState() {
        setState();
        return this.state;
    }

    private void setState() {
        this.state = faker.address().state();
    }

    public String getCountry() {
        setCountry();
        return this.country;
    }

    private void setCountry() {
        this.country = faker.address().country();
    }

    public String getZipCode() {
        setZipCode();
        return this.zipCode;
    }

    private void setZipCode() {
        this.zipCode = faker.address().zipCode();
    }
}

