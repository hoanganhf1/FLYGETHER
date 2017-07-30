package com.flygether.web.controllers;

import com.flygether.service.home.IHomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value = {"/", "/home", "/index"})
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IHomeService homeService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        logger.debug("index() is executed!");

        model.put("title", homeService.getTitle(""));
        model.put("msg", homeService.getDesc());

        return "index";
    }
}
