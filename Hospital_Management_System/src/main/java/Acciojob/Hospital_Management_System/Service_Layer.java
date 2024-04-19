package Acciojob.Hospital_Management_System;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Layer {

    Repository_Layer RepositoryLayerObj = new Repository_Layer();

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
