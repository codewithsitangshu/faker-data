package org.codewithsitangshu.data;

public class Name extends Data {

    private String firstName;
    private String lastName;
    private String fullName;
    private String username;

    public String getFirstName() {
        setFirstName();
        return this.firstName;
    }

    private void setFirstName() {
        this.firstName = faker.name().firstName();
    }

    public String getLastName() {
        setLastName();
        return this.lastName;
    }

    private void setLastName() {
        this.lastName = faker.name().lastName();
    }

    public String getFullName() {
        setFullName();
        return this.fullName;
    }

    private void setFullName() {
        this.fullName = faker.name().fullName();
    }

    public String getUsername() {
        setUsername();
        return this.username;
    }

    private void setUsername() {
        this.username = faker.name().username();
    }
}
