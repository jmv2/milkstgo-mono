package com.mingeso.milkstgomono.repository;

import com.mingeso.milkstgomono.entities.ProviderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProviderRepository extends CrudRepository<ProviderEntity, Long> {
}
