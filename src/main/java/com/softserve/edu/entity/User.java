package com.softserve.edu.entity;

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
        //
        // Code
        //
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
