package org.codewithsitangshu.data;

public class Internet extends Data {

    private String email;
    private String username;
    private String password;
    private String domainName;
    private String ipAddress;

    public String getEmail() {
        setEmail();
        return this.email;
    }

    private void setEmail() {
        this.email = faker.internet().emailAddress();
    }

    public String getUsername() {
        setUsername();
        return this.username;
    }

    private void setUsername() {
        this.username = faker.internet().domainName();
    }

    public String getPassword() {
        setPassword();
        return this.password;
    }

    private void setPassword() {
        this.password = faker.internet().password();
    }

    public String getDomainName() {
        setDomainName();
        return this.domainName;
    }

    private void setDomainName() {
        this.domainName = faker.internet().domainName();
    }

    public String getIpAddress() {
        setIpAddress();
        return this.ipAddress;
    }

    private void setIpAddress() {
        this.ipAddress = faker.internet().ipV4Address();
    }
}

