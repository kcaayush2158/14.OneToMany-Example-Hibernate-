package com.application.model;

import javax.persistence.*;

@Entity
@Table(name = "UserDetails")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinTable(name="VECHILE_ID")
    private Vehicle vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



}