package Acciojob.Hospital_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class Controller_Layer {

    @Autowired
    Service_Layer serviceLayerObj;

    @GetMapping("Check API")
    public String check(){
        return "Yes it is Working";
    }

    @PostMapping("addPatientInfo")
    public String addPatientInfo(@RequestBody() Patient p){

        return serviceLayerObj.addPatientInfo(p);
    }
    @GetMapping("list of all Patients")
    public String ListOfAllPatient(){
        for(Patient p : serviceLayerObj.ListOfAllPatient()){
            System.out.println(p.getPatientName());
        }
        return "This is the list of patients";
    }
    @GetMapping("findPatientNameByID")
    public String findPatientNameByID(@RequestParam("ID") Integer id){
        //Step 1 :- get the list of the patient
        List<Patient> list = serviceLayerObj.ListOfAllPatient();
        for(Patient p : list){
            if(Objects.equals(id, p.getPatientID())){
                return "The name of the patient with patientID " + id + " is " + p.getPatientName();
            }
        }
        return "We are not found any Patient with PatientID " + id;
    }
    @GetMapping("TotalNumberOfPatient")
    public String TotalNumberOfPatient(){
        return "The Total Number of Patient in the Hospital are " + serviceLayerObj.TotalNumberOfPatient();
    }

}
