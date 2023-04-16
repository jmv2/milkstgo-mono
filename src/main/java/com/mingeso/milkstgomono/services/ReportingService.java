package com.mingeso.milkstgomono.services;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import com.mingeso.milkstgomono.entities.ProviderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReportingService {
    @Autowired
    CollectionService collectionService;
    public double milkCollectionPayment(ProviderEntity provider){
        double numero = 0;
        ArrayList<CollectionEntity> collections = new ArrayList<>();
        collections = collectionService.getCollectionsByProviderCod(provider);
        System.out.println(collections);
        return numero;
    }
}
