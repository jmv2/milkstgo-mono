package com.mingeso.milkstgomono.services;

import com.mingeso.milkstgomono.entities.LabAnalisysEntity;
import com.mingeso.milkstgomono.repository.LabAnalisysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabAnalisysService {
    @Autowired
    LabAnalisysRepository labAnalisysRepository;

    public void saveAll(List<LabAnalisysEntity> labAnalisysEntityList){

        labAnalisysRepository.saveAll(labAnalisysEntityList);
    }

    public void deleteAllLabAnalisys(){
        labAnalisysRepository.deleteAll();
    }



}
