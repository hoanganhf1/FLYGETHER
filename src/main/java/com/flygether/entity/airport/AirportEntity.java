package com.flygether.entity.airport;


import com.flygether.entity.AbstractEntity;
import org.flygether.entity.airport.IAirPortEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class AirportEntity extends AbstractEntity implements IAirPortEntity {

    public static final String NAME = "airportEntity";
    private static Logger logger = LoggerFactory.getLogger(AirportEntity.class);

    private String airPortName;
    private String location;
    private String city;
    private String state;
    private String country;
    private String zip;

    @Column(name = "AIRPORT_NAME")
    @Override
    public String getAirPortName() {
        return airPortName;
    }

    @Override
    public void setAirPortName(String airPortName) {
        this.airPortName = airPortName;
    }

    @Column(name = "LOCATION")
    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "CITY")
    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "STATE")
    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "COUNTRY")
    @Override
    public String getCountry() {
        return country;
    }

    public void setCountry(String counrty) {
        this.country = counrty;
    }

    @Column(name = "ZIP")
    @Override
    public String getZip() {
        return zip;
    }

    @Override
    public void setZip(String zip) {
        this.zip = zip;
    }
}
