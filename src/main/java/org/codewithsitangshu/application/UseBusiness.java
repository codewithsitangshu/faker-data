package org.codewithsitangshu.application;

import org.codewithsitangshu.data.Business;

public class UseBusiness {

    public static void main(String[] args) {

        Business business = new Business();

        System.out.println("Job title is " + business.getJobTitle());
        System.out.println("Company name is " + business.getCompanyName());

    }
}

