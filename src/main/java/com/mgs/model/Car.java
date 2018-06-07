package com.mgs.model;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "car")
public class Car {
    private Long id;
    private String licensePlate;
    private String manufacturer;
    private DateTime manufactureDate;
//    private LocalDateTime manufactureDate;
    private int age;
    private int version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    @Column(name = "LICENSE_PLATE")
    public String getLicensePlate() {
        return licensePlate;
    }

    @Column(name = "MANUFACTURER")
    public String getManufacturer() {
        return manufacturer;
    }

    @Column(name = "MANUFACTURE_DATE")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    public DateTime getManufactureDate() {
        return manufactureDate;
    }

/*
    @Column(name = "MANUFACTURE_DATE")
    @Type(type = "org.jadira.usertype.dateandtirne.joda.PersistentDateTime")
    public LocalDateTime getManufactureDate() {
        return manufactureDate;
    }
*/


    @Column(name = "AGE")
    public int getAge() {
        return age;
    }

    @Version
    public int getVersion() {
        return version;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufactureDate(DateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

/*
    public void setManufactureDate(LocalDateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
*/


    public void setAge(int age) {
        this.age = age;
    }

    public void setVersion(int version) {
        this.version = version;
    }

@Override
    public String toString(){
    return "License:  "  +  licensePlate  +  "  - Manufacturer:  "  +  manufacturer
            + "  - Manufacture  Date:  "  +  manufactureDate
            + "- Age:  " +  age;
}
}
