package com.mingeso.milkstgomono.repository;

import com.mingeso.milkstgomono.entities.CollectionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CollectionRepository extends CrudRepository<CollectionEntity, Long> {
}
