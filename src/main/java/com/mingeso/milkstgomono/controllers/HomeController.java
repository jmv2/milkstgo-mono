package com.mingeso.milkstgomono.controllers;

import com.mingeso.milkstgomono.entities.ProviderEntity;
import com.mingeso.milkstgomono.services.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    ReportingService reportingService;
    @GetMapping("/")
    public String index(){

        return "index";
    }
}
