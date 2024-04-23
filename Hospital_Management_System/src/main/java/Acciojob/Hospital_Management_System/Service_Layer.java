package Acciojob.Hospital_Management_System;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Layer {

    // this "Autowired" keyword is used to inject the bean(Java object created by Spring)
    // from the IOC Container(Inversion of Control) to this particular layer
    @Autowired
    Repository_Layer RepositoryLayerObj;

    public String addPatientInfo(Patient p){
        return RepositoryLayerObj.addPatientInfo(p);
    }

    public List<Patient> ListOfAllPatient(){
        return RepositoryLayerObj.ListOfAllPatient();
    }

    public int TotalNumberOfPatient(){
        return RepositoryLayerObj.TotalNumberOfPatient();
    }
}