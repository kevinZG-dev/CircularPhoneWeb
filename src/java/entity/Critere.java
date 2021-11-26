/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author kevin
 */
public class Critere {
    
    private int idSmartphone;
    private String nom;
    private double note;
    private String descriptionCritere;
    private String type;
    private boolean valid;
    
    public Critere(int idSmartphone, String nom, double note, String type) {
        this.idSmartphone = idSmartphone;
        this.nom = nom;
        this.note = note;
        this.type = type;
        valid=false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String getDescriptionCritere() {
        return descriptionCritere;
    }

    public void setDescriptionCritere(String descriptionCritere) {
        this.descriptionCritere = descriptionCritere;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
}
