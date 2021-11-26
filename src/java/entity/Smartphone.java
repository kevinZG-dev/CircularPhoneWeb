/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Critere;
import java.sql.Blob;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author kevin
 */
public class Smartphone {

    private int id;
    private String nom, couleur, memoire;
    private double prix, prixvolpy, prixback, prixwefix, prixfnac, prixamazon;
    private String lienvolpy, lienback, lienwefix, lienfnac, lienamazon;
    private double circularscore;
    private double avisClient;
    private double indicedeRepa;
    private double critereSelectScore;
    private String imgName1,imgName2, imgName3, imgName4;
    private Fonctionnalite fonctionnalite;
    private ArrayList<Critere> listPerformance;
    private ArrayList<Critere> listReparabilite;
    private ArrayList<Critere> listDevdurable;

    public Smartphone(int id, String nom,String couleur, String memoire, 
            double prix, double prixvolpy, double prixback, double prixwefix,
            double prixfnac, double prixamazon, 
            String lienvolpy, String lienback, String lienwefix, String lienfnac,String lienamazon,double circularscore, 
            double indicedeRepa, Fonctionnalite fonctionnalite,
            ArrayList<Critere> listPerformance, ArrayList<Critere> listReparabilite, ArrayList<Critere> listDevdurable, 
            String imgName1,String imgName2,String imgName3,String imgName4) {
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
        this.memoire = memoire;
        this.avisClient = avisClient;
        this.circularscore = circularscore;
        this.indicedeRepa = indicedeRepa;
        this.prix = prix;
        this.prixvolpy = prixvolpy;
        this.prixback = prixback;
        this.prixwefix = prixwefix;
        this.prixfnac = prixfnac;
        this.prixamazon = prixamazon;
        this.lienvolpy = lienvolpy;
        this.lienback = lienback;
        this.lienwefix = lienwefix;
        this.lienfnac = lienfnac;
        this.lienamazon = lienamazon;
        this.fonctionnalite = fonctionnalite;
        this.listPerformance = listPerformance;
        this.listReparabilite = listReparabilite;
        this.listDevdurable = listDevdurable;
        this.imgName1 = imgName1;
        this.imgName2 = imgName2;
        this.imgName3 = imgName3;
        this.imgName4 = imgName4;
    }
    
    public double getAvisclient()
    {
        return avisClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrixvolpy() {
        return prixvolpy;
    }

    public void setPrixvolpy(double prixvolpy) {
        this.prixvolpy = prixvolpy;
    }

    public double getPrixback() {
        return prixback;
    }

    public void setPrixback(double prixback) {
        this.prixback = prixback;
    }

    public double getPrixwefix() {
        return prixwefix;
    }

    public void setPrixwefix(double prixwefix) {
        this.prixwefix = prixwefix;
    }

    public String getLienvolpy() {
        return lienvolpy;
    }

    public void setLienvolpy(String lienvolpy) {
        this.lienvolpy = lienvolpy;
    }

    public String getLienback() {
        return lienback;
    }

    public void setLienback(String lienback) {
        this.lienback = lienback;
    }

    public String getLienwefix() {
        return lienwefix;
    }

    public void setLienwefix(String lienwefix) {
        this.lienwefix = lienwefix;
    }

    public double getIndicedeRepa() {
        return indicedeRepa;
    }

    public void setIndicedeRepa(double indicedeRepa) {
        this.indicedeRepa = indicedeRepa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCritereSelectScore() {
        return critereSelectScore;
    }

    public void setCritereSelectScore(double critereSelectScore) {
        this.critereSelectScore = critereSelectScore;
    }

    public String getImgName1() {
        return imgName1;
    }

    public void setImgName1(String imgName1) {
        this.imgName1 = imgName1;
    }

    public Fonctionnalite getFonctionnalite() {
        return fonctionnalite;
    }

    public void setFonctionnalite(Fonctionnalite fonctionnalite) {
        this.fonctionnalite = fonctionnalite;
    }

    public ArrayList<Critere> getListPerformance() {
        return listPerformance;
    }

    public void setListPerformance(ArrayList<Critere> listPerformance) {
        this.listPerformance = listPerformance;
    }

    public ArrayList<Critere> getListReparabilite() {
        return listReparabilite;
    }

    public void setListReparabilite(ArrayList<Critere> listReparabilite) {
        this.listReparabilite = listReparabilite;
    }

    public ArrayList<Critere> getListDevdurable() {
        return listDevdurable;
    }

    public void setListDevdurable(ArrayList<Critere> listDevdurable) {
        this.listDevdurable = listDevdurable;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMemoire() {
        return memoire;
    }

    public void setMemoire(String memoire) {
        this.memoire = memoire;
    }

    public double getPrixfnac() {
        return prixfnac;
    }

    public void setPrixfnac(double prixfnac) {
        this.prixfnac = prixfnac;
    }

    public double getPrixamazon() {
        return prixamazon;
    }

    public void setPrixamazon(double prixamazon) {
        this.prixamazon = prixamazon;
    }

    public String getLienfnac() {
        return lienfnac;
    }

    public void setLienfnac(String lienfnac) {
        this.lienfnac = lienfnac;
    }

    public String getLienamazon() {
        return lienamazon;
    }

    public void setLienamazon(String lienamazon) {
        this.lienamazon = lienamazon;
    }

    public double getCircularscore() {
        return circularscore;
    }

    public void setCircularscore(double circularscore) {
        this.circularscore = circularscore;
    }

    public String getImgName2() {
        return imgName2;
    }

    public void setImgName2(String imgName2) {
        this.imgName2 = imgName2;
    }

    public String getImgName3() {
        return imgName3;
    }

    public void setImgName3(String imgName3) {
        this.imgName3 = imgName3;
    }

    public String getImgName4() {
        return imgName4;
    }

    public void setImgName4(String imgName4) {
        this.imgName4 = imgName4;
    }
    
}
