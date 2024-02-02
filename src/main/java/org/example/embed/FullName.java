package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String firstName;
    private String secondName;

    public FullName() {
    }

    public FullName(String firstName, String secondName) {
        this.setFirstName(firstName);
        this.setSecondName(secondName);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
