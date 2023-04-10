package com.mingeso.milkstgomono.services;

import com.mingeso.milkstgomono.entities.ProviderEntity;
import com.mingeso.milkstgomono.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    @Autowired
    ProviderRepository providerRepository;

    public void deleteAll() {
        providerRepository.deleteAll();
    }

    public void saveProvider(ProviderEntity provider) {
        providerRepository.save(provider);
    }
}
