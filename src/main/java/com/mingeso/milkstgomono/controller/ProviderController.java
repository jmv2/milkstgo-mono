package com.mingeso.milkstgomono.controller;

import com.mingeso.milkstgomono.repository.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @GetMapping
    public String index(){

        return "index";
    }
    @GetMapping("/nuevo-proveedor")
    public String formProvider(Model model){

        return "formProviders";
    }
}
