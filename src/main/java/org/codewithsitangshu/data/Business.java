package org.codewithsitangshu.data;

public class Business extends Data {

    private String jobTitle;
    private String companyName;

    public String getJobTitle() {
        setJobTitle();
        return this.jobTitle;
    }

    private void setJobTitle() {
        this.jobTitle = faker.job().title();
    }

    public String getCompanyName() {
        setCompanyName();
        return this.companyName;
    }

    private void setCompanyName() {
        this.companyName = faker.company().name();
    }
}

