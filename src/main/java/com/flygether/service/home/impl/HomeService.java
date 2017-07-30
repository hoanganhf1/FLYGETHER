package com.flygether.service.home.impl;

import com.flygether.service.home.IHomeService;
import org.flygether.entity.airport.IAirportHome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class HomeService implements IHomeService {

    private static final Logger logger = LoggerFactory.getLogger(HomeService.class);

    @Autowired
    protected IAirportHome airportHome;

    @Override
    public String getDesc() {
        logger.debug("getDesc() is executed!");
        return "Gradle + Spring MVC Hello World Example";
    }

    @Override
    public String getTitle(String name) {
        logger.debug("getTitle() is executed! $name : {}", name);

        if (StringUtils.isEmpty(name)) {
            return airportHome.findByPk(1).getCode();
        } else {
            return "Hello " + airportHome.findByPk(1).getCode();
        }
        //return "where am I?";
    }
}
