package com.mingeso.milkstgomono.services;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import com.mingeso.milkstgomono.entities.ProviderEntity;
import com.mingeso.milkstgomono.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {
    @Autowired
    CollectionRepository collectionRepository;

    public void saveAll(List<CollectionEntity> collectionEntities){

        collectionRepository.saveAll(collectionEntities);
    }

    public void deleteAllCollections(){
        collectionRepository.deleteAll();
    }

    public ArrayList<CollectionEntity> getAllCollections(){
        ArrayList<CollectionEntity> collections = new ArrayList<>();
        collections = (ArrayList<CollectionEntity>) collectionRepository.findAll();
        return collections;
    }

    public ArrayList<CollectionEntity> getCollectionsByProviderCod(ProviderEntity provider) {
        ArrayList<CollectionEntity> collections = new ArrayList<>();
        collections = collectionRepository.getCollectionEntitiesByCodProvider(provider.getCodProvider());

        return collections;
    }

}
