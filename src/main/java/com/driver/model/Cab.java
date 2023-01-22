package com.driver.model;

import javax.persistence.*;

@Table
@Entity

public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private int perKmRate;
    private boolean available;


    @OneToOne
    @JoinColumn
    private Driver driver;
}