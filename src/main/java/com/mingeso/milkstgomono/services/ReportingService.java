package com.mingeso.milkstgomono.services;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import com.mingeso.milkstgomono.entities.ProviderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportingService {
    @Autowired
    CollectionService collectionService;
    public void milkCollectionPayment(List<ProviderEntity> providers){
        ArrayList<CollectionEntity> collections = new ArrayList<>();
        collections = collectionService.getAllCollections();
        ArrayList<Double> queleches = new ArrayList<>();
        double leche = 0;

        for (ProviderEntity p:
             providers) {
                for (CollectionEntity c:
                        collections) {
                        leche =+ c.getMilkAmount();
                }

                queleches.add(leche);
        }

    }
}
