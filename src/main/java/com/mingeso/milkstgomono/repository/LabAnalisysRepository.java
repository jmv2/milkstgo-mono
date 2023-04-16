package com.mingeso.milkstgomono.repository;

import com.mingeso.milkstgomono.entities.LabAnalisysEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabAnalisysRepository extends CrudRepository<LabAnalisysEntity, Long> {
}
