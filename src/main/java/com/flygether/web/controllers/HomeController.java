package com.flygether.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home*")
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);
}
