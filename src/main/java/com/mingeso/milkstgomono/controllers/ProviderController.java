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

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/proveedor")
public class ProviderController {
    @Autowired
    ProviderService providerService;
    @GetMapping("/nuevo")
    public String formProvider(Model model){
        List<String> options = new ArrayList<String>();
        options.add("A");
        options.add("B");
        options.add("C");
        options.add("D");

        model.addAttribute("options", options);
        model.addAttribute("provider", new ProviderEntity());
        return "new-provider";
    }
    @PostMapping("/nuevo")
    public String newProvider(@ModelAttribute ProviderEntity provider, Model model){
        model.addAttribute("provider", provider);
        providerService.saveProvider(provider);
        return "redirect:/";
    }

    @GetMapping("/todos")
    public String listAllProviders(Model model){
        List<ProviderEntity> providerEntityList = providerService.getAllProviders();
        model.addAttribute("providers", providerEntityList);
        return "providers";
    }

    @GetMapping("/delete-all")
    public String deleteAll(){
        providerService.deleteAll();
        return "redirect:/";
    }

}
