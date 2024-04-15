package org.codewithsitangshu.data;

import java.util.Date;

public class DateTime extends Data {

    private Date birthDate;
    private Date futureDate;
    private Date pastDate;
    private Date recentDate;

    public Date getBirthDate() {
        setBirthDate();
        return this.birthDate;
    }

    private void setBirthDate() {
        this.birthDate = faker.date().birthday();
    }

    public Date getFutureDate() {
        setFutureDate();
        return this.futureDate;
    }

    private void setFutureDate() {
        this.futureDate = faker.date().future(10, java.util.concurrent.TimeUnit.DAYS);
    }

    public Date getPastDate() {
        setPastDate();
        return this.pastDate;
    }

    private void setPastDate() {
        this.pastDate = faker.date().past(30, java.util.concurrent.TimeUnit.DAYS);
    }

    public Date getRecentDate() {
        setRecentDate();
        return this.recentDate;
    }

    private void setRecentDate() {
        this.recentDate = faker.date().past(7, java.util.concurrent.TimeUnit.DAYS);
    }
}

