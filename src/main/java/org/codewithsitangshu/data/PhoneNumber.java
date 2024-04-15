package org.codewithsitangshu.data;

public class PhoneNumber extends Data {

    private String phoneNumber;

    public String getPhoneNumber() {
        setPhoneNumber();
        return this.phoneNumber;
    }

    private void setPhoneNumber() {
        this.phoneNumber = faker.phoneNumber().phoneNumber();
    }
}

