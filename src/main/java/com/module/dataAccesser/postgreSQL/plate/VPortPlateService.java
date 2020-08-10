package com.module.dataAccesser.postgreSQL.plate;

import com.module.dataAccesser.pojo.VPortPlate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VPortPlateService {
    @Autowired
    private VPortPlateRepository vPortPlateRepository;

    //plate_id
    public VPortPlate getVPortPlateById(long plateId){
        VPortPlate obj = null;
        if(vPortPlateRepository.findById(plateId).isPresent()){
            obj = vPortPlateRepository.findById(plateId).get();
            System.out.println("*************************\n********************\n*******************");
        }else {
            System.out.println("***************************************************");
        }

        return obj;
    }
}
