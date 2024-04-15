package org.codewithsitangshu.application;

import org.codewithsitangshu.data.Name;

public class UseName {

    public static void main(String[] args) {

        Name name = new Name();

        System.out.println("First name is " + name.getFirstName());
        System.out.println("Last name is " + name.getLastName());
        System.out.println("Full name is " + name.getFullName());
        System.out.println("User name is " + name.getUsername());

    }
}
