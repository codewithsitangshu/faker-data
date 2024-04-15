package org.codewithsitangshu.application;

import org.codewithsitangshu.data.Internet;

public class UseInternet {

    public static void main(String[] args) {

        Internet internet = new Internet();

        System.out.println("Email is " + internet.getEmail());
        System.out.println("Username is " + internet.getUsername());
        System.out.println("Password is " + internet.getPassword());
        System.out.println("Domain name is " + internet.getDomainName());
        System.out.println("IP address is " + internet.getIpAddress());

    }
}

