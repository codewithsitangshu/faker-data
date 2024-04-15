package org.codewithsitangshu.application;

import org.codewithsitangshu.data.Address;

public class UseAddress {

    public static void main(String[] args) {

        Address address = new Address();

        System.out.println("Full address is " + address.getFullAddress());
        System.out.println("Street address is " + address.getStreetAddress());
        System.out.println("City is " + address.getCity());
        System.out.println("State is " + address.getState());
        System.out.println("Country is " + address.getCountry());
        System.out.println("Zip code is " + address.getZipCode());

    }
}

