package com.mingeso.milkstgomono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProviderController {

    @GetMapping
    public String index(){

        return "index";
    }
    @GetMapping("/nuevo-proveedor")
    public String formProvider(Model model){

        return "formProviders";
    }
}
