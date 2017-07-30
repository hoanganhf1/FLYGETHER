package com.flygether.entity.airport;

import com.flygether.entity.EntityHome;
import org.flygether.entity.airport.IAirportHome;
import org.springframework.stereotype.Repository;


@Repository
public class AirportHome extends EntityHome implements IAirportHome {

    public AirportHome() {
        super(AirportEntity.NAME, AirportEntity.class);
    }
}
