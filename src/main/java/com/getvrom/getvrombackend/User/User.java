package com.getvrom.getvrombackend.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity // database table name = User
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column
    @Size(min=26,message = "First Name should be a min of 26 characters")
    private String firstName;

    @Column
    @Size(min = 26, message = "Last Name should be a min of 26 characters")
    private String lastName;

    @Column
    @Size(min = 10)
    private String role;

    protected User() {
    }

    public User(String firstName, String lastName, String role) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
