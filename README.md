# Generate Test Data Using Faker

![Data](data.gif)

In test automation, data generation poses a significant challenge due to the need for diverse and realistic datasets to thoroughly validate software functionality. Faker emerges as a crucial tool addressing this challenge, providing a streamlined solution for generating synthetic yet authentic data across various testing scenarios. With its extensive range of functionalities, Faker significantly reduces the overhead of manually crafting test data, enhancing the efficiency and effectiveness of automated testing processes. By seamlessly integrating Faker into test automation frameworks, testers can effortlessly simulate real-world scenarios, ensuring comprehensive test coverage and robust software quality assurance. With its ability to generate data spanning names, addresses, emails, and beyond, Faker stands as an indispensable asset in the arsenal of every test automation engineer, streamlining testing workflows and accelerating product delivery cycles.

# Faker

It is a very simple library to produce test data at random which looks like real data. More info is [here](https://github.com/DiUS/java-faker?tab=readme-ov-file). <br>

Here is the [Faker](https://dius.github.io/java-faker/apidocs/index.html) app doc.

Include below [maven](https://mvnrepository.com/artifact/com.github.javafaker/javafaker) dependency in your pom file.

```xml
<dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
</dependency>
```

# Generate Name

Generate name randomly using below code

```java
//Create Faker object
Faker faker = new Faker();

//Generate First name
String firstName = faker.name().firstName();

//Generate Last Name
String lastName = faker.name().lastName();

//Generate Full Name
String fullName = faker.name().fullName();

//Generate User Name
String username = faker.name().username();
```

**Output**

```text
First name is Towanda
Last name is Quigley
Full name is Lazaro Marquardt III
User name is nathanial.hoeger
```

# Generate Address

Generate address randomly using below code

```java
// Create Faker object
Faker faker = new Faker();

// Generate Full Address
String fullAddress = faker.address().fullAddress();

// Generate Street Address
String streetAddress = faker.address().streetAddress();

// Generate City
String city = faker.address().city();

// Generate State
String state = faker.address().state();

// Generate Country
String country = faker.address().country();

// Generate Zip Code
String zipCode = faker.address().zipCode();
```

**Output**

```text
Full address is 72442 Renner Cove Suite 111
Street address is 72442 Renner Cove Suite 111
City is West Lyda
State is New Hampshire
Country is Ukraine
Zip code is 88358
```

# Generate Business Data

Generate business-related data randomly using the following code snippet:

```java
// Create Faker object
Faker faker = new Faker();

// Generate Job Title
String jobTitle = faker.job().title();

// Generate Company Name
String companyName = faker.company().name();
```

**Output**

```text
Job title is Regional Data Associate
Company name is Smith, LLC
```

# Generate Content Data

Generate content-related data randomly using the following code snippet:

```java
// Create Faker object
Faker faker = new Faker();

// Generate Sentence
String sentence = faker.lorem().sentence();

// Generate Paragraph
String paragraph = faker.lorem().paragraph();
```

**Output**

```text
Generated sentence: Nullam posuere dui non iaculis interdum.
Generated paragraph: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam.
```

Here's the content formatted in Markdown for generating internet-related data:

# Generate Internet Data

Generate internet-related data randomly using the following code snippet:

```java
// Create Faker object
Faker faker = new Faker();

// Generate Email
String email = faker.internet().emailAddress();

// Generate Username
String username = faker.internet().domainName();

// Generate Password
String password = faker.internet().password();

// Generate Domain Name
String domainName = faker.internet().domainName();

// Generate IP Address
String ipAddress = faker.internet().ipV4Address();
```

**Output**

```text
Generated email: towanda26@example.com
Generated username: mitchell77
Generated password: _<UY*xS7D4;9Hv#E
Generated domain name: collins.net
Generated IP address: 192.168.1.1
```

# Generate Date and Time Data

Generate date and time-related data randomly using the following code snippet:

```java
// Create Faker object
Faker faker = new Faker();

// Generate Birth Date
Date birthDate = faker.date().birthday();

// Generate Future Date (10 days into the future)
Date futureDate = faker.date().future(10, java.util.concurrent.TimeUnit.DAYS);

// Generate Past Date (30 days into the past)
Date pastDate = faker.date().past(30, java.util.concurrent.TimeUnit.DAYS);

// Generate Recent Date (Within the last 7 days)
Date recentDate = faker.date().past(7, java.util.concurrent.TimeUnit.DAYS);
```

**Output**

```text
Generated birth date: Mon Mar 10 22:47:52 UTC 1980
Generated future date: Sun May 01 22:47:52 UTC 2022
Generated past date: Tue Mar 09 22:47:52 UTC 2021
Generated recent date: Tue Mar 30 22:47:52 UTC 2021
```

# Generate Phone Number Data

Generate phone number-related data randomly using the following code snippet:

```java
// Create Faker object
Faker faker = new Faker();

// Generate Phone Number
String phoneNumber = faker.phoneNumber().phoneNumber();
```

**Output**

```text
Generated phone number: (123) 456-7890
```

# Summary:

Faker is a simple and small library. These above objects will be fine for most of our use cases to produce test data for your test automation scripts.