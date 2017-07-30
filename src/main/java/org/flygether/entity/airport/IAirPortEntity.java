package org.flygether.entity.airport;

import org.flygether.entity.IEntity;

public interface IAirPortEntity extends IEntity {

    String getAirPortName();
    void setAirPortName(String airPortName);

    String getLocation();
    void setLocation(String location);

    String getCity();
    void setCity(String city);

    String getState();
    void setState(String state);

    String getCountry();
    void setCountry(String country);

    String getZip();
    void setZip(String zip);
}
