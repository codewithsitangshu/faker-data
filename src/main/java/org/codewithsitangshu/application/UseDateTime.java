package org.codewithsitangshu.application;

import org.codewithsitangshu.data.DateTime;

import java.util.Date;

public class UseDateTime {

    public static void main(String[] args) {

        DateTime dateTime = new DateTime();

        System.out.println("Birth date is: " + dateTime.getBirthDate());
        System.out.println("Future date is: " + dateTime.getFutureDate());
        System.out.println("Past date is: " + dateTime.getPastDate());
        System.out.println("Recent date is: " + dateTime.getRecentDate());

    }
}

