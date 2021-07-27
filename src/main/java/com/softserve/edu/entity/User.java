package com.softserve.edu.entity;

import java.util.Objects;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String companyName;
    private String roleName;

    public User(String firstName, String lastName, String companyName, String roleName) {
        this.id = -1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.roleName = roleName;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRoleName() {
        return roleName;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        //
        // Code
        //
        result = prime * result +((firstName == null)? 0:firstName.hashCode())+
                ((lastName== null)?0:lastName.hashCode()) + ((companyName == null)? 0 : companyName.hashCode()
                +((roleName==null)?0:roleName.hashCode()));

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        User other = (User) obj;
        boolean result = true;
        result = id == other.id && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName) && Objects.equals(companyName, other.companyName)
                && Objects.equals(roleName, other.roleName);

        return result;
    }





    @Override
    public String toString() {
        return "\nUser [id=" + id
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + ", companyName=" + companyName
                + ", roleName=" + roleName + "]";
    }

}
