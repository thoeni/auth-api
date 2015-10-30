package com.andigital.auth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author antoniotroina
 */

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 4639055145442147935L;

    @Id
    private int id;
    private String lastName;
    private String firstName;
    private String address;
    private String city;

    protected User() {}

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
