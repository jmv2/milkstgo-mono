package com.mingeso.milkstgomono.services;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import com.mingeso.milkstgomono.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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



}
