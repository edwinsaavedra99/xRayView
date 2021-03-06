package com.example.dashboard.Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SharedFile {
    private String imageFileProject;
    private String nameFileProject;
    private String DateFileProject;
    private String timeFileProject;
    private String descriptionFileProject;
    private String dateAux;
    private String emailFrom;
    private String privilege;
    private String id;
    private String carpeta;
    private int patient;

    public SharedFile(String imageFileProject, String nameFileProject, String descriptionFileProject,String dateFileProject, String emailFrom,String privilege,String id,String carpeta,int patient) {
        this.patient = patient;
        this.carpeta = carpeta;
        this.emailFrom =emailFrom;
        this.privilege = privilege;
        this.id = id;
        this.imageFileProject = imageFileProject;
        this.nameFileProject = nameFileProject;
        this.descriptionFileProject = descriptionFileProject;
        this.dateAux = dateFileProject;
        char[] test = dateFileProject.toCharArray();
        try {
            this.DateFileProject = dateFileProject.substring(0,dateFileProject.indexOf("_")) + "/" +dateFileProject.substring(0,dateFileProject.indexOf("_")) + "/" + dateFileProject.substring(0,dateFileProject.indexOf("_"));
            this.timeFileProject = dateFileProject.substring(0,dateFileProject.indexOf("_")) + ":" + dateFileProject.substring(0,dateFileProject.indexOf("_"))+ ":" + dateFileProject;
        }catch (Exception e){
            this.DateFileProject = "";
            this.timeFileProject = "";
        }
    }
    public SharedFile(String imageFileProject, String nameFileProject, String descriptionFileProject,String dateFileProject, String emailFrom,String privilege,String id,String carpeta) {
        this.carpeta = carpeta;
        this.emailFrom =emailFrom;
        this.privilege = privilege;
        this.id = id;
        this.imageFileProject = imageFileProject;
        this.nameFileProject = nameFileProject;
        this.descriptionFileProject = descriptionFileProject;
        this.dateAux = dateFileProject;
        char[] test = dateFileProject.toCharArray();
        try {
            this.DateFileProject = dateFileProject.substring(0,dateFileProject.indexOf("_")) + "/" +dateFileProject.substring(0,dateFileProject.indexOf("_")) + "/" + dateFileProject.substring(0,dateFileProject.indexOf("_"));
            this.timeFileProject = dateFileProject.substring(0,dateFileProject.indexOf("_")) + ":" + dateFileProject.substring(0,dateFileProject.indexOf("_"))+ ":" + dateFileProject;
        }catch (Exception e){
            this.DateFileProject = "";
            this.timeFileProject = "";
        }
    }
    public void DateTimeInitial(){
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        this.timeFileProject = hourFormat.format(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.DateFileProject = dateFormat.format(date);
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy/HH/mm/ss");
        String test = hourdateFormat.format(date);
        System.out.println(test);
    }

    public String getTimeFileProject() {
        return timeFileProject;
    }

    public void setTimeFileProject(String timeFileProject) {
        this.timeFileProject = timeFileProject;
    }

    public String getDateFileProject() {
        return DateFileProject;
    }

    public void setDateFileProject(String dateFileProject) {
        DateFileProject = dateFileProject;
    }

    public String getImageFileProject() {
        return imageFileProject;
    }

    public void setImageFileProject(String imageFileProject) {
        this.imageFileProject = imageFileProject;
    }

    public String getNameFileProject() {
        return nameFileProject;
    }

    public void setNameFileProject(String nameFileProject) {
        this.nameFileProject = nameFileProject;
    }

    public String getDescriptionFileProject() {
        return descriptionFileProject;
    }

    public void setDescriptionFileProject(String descriptionFileProject) {
        this.descriptionFileProject = descriptionFileProject;
    }

    public String getDateAux() {
        return dateAux;
    }

    public void setDateAux(String dateAux) {
        this.dateAux = dateAux;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }
}
