package org.codewithsitangshu.data;

import com.github.javafaker.Faker;

public abstract class Data {

    protected Faker faker;

    protected Data() {
        faker = new Faker();
    }

}
