package com.mingeso.milkstgomono.controllers;

import com.mingeso.milkstgomono.entities.ProviderEntity;
import com.mingeso.milkstgomono.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/nuevo-proveedor")
    public String newProvider(@ModelAttribute ProviderEntity provider, Model model){
        model.addAttribute("provider", provider);
        providerService.saveProvider(provider);
        return "formProviders";
    }

    @GetMapping("/nuevo-proveedor")
    public String formProvider(Model model){
        model.addAttribute("provider", new ProviderEntity());
        return "formProviders";
    }

    @GetMapping("/borrar-todo")
    public String deleteAll(){
        providerService.deleteAll();
        return "index";
    }

}
