package com.mingeso.milkstgomono.repository;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface CollectionRepository extends CrudRepository<CollectionEntity, Long> {

    public ArrayList<CollectionEntity> getCollectionEntitiesByCodProvider(String codProvider);
}
