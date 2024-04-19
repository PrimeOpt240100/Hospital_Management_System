package Acciojob.Hospital_Management_System;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class Repository_Layer {
    HashMap<Integer, Patient> hm = new HashMap<>();

    // Method to add Patient information into DataBase
    public String addPatientInfo(Patient p){
        hm.put(p.getPatientID(),p);
        return "Patient with ID " + p.getPatientID()+ " has been added into DateBase";
    }

    // Return List of all Patient
    public List<Patient> ListOfAllPatient(){
        return new ArrayList<>(hm.values());
    }
    // Return Total Number Patient in Hospital
    public int TotalNumberOfPatient(){
        return hm.size();
    }
}
