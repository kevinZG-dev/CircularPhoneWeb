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
public class Fonctionnalite {

    private String marque;
    private String os;
    private boolean quatreG;
    private boolean cinqG;
    private boolean microSD;
    private boolean batterieAmovible;
    private boolean esim;
    private String dimensions, poids, diagonaleecran, definitionecran, resolution,
            typedecran, partecran, pucemobile, processeur;
    private int nbrdecoeur;
    private String gpu, memoirevive, capabatterie, captphotoav, captvideo, connectique;
    private boolean capteurdempreinte;
    private String typewifi, typebluetooth;
    private boolean nfc;
    private String typedetancheite;
    private boolean gyroscope, induction,antichoc;
    

    public Fonctionnalite(String marque, String os, boolean quatreG, boolean cinqG, boolean microSD, boolean batterieamovible, boolean esim,
            String dimensions, String poids, String diagonaleecran, 
            String definitionecran, String resolution, String typedecran, 
            String partecran, String pucemobile, String processeur, int nbrdecoeur, String gpu, 
            String memoirevive, String capabatterie, String captphotoav, 
            String captvideo, String connectique, boolean capteurdempreinte, 
            String typewifi, String typebluetooth, boolean nfc, String typedetancheite, 
            boolean gyroscope, boolean induction, boolean antichoc ) {
        this.marque = marque;
        this.os = os;
        this.quatreG = quatreG;
        this.cinqG = cinqG;
        this.microSD = microSD;
        this.batterieAmovible = batterieamovible;
        this.esim = esim;

        this.dimensions = dimensions;
        this.poids = poids;
        this.diagonaleecran = diagonaleecran;
        this.definitionecran = definitionecran;
        this.resolution = resolution;
        this.typedecran = typedecran;
        this.partecran = partecran;
        this.pucemobile = pucemobile;
        this.processeur = processeur;
        this.nbrdecoeur = nbrdecoeur;
        this.gpu = gpu;
        this.memoirevive = memoirevive;
        this.capabatterie = capabatterie;
        this.captphotoav = captphotoav;
        this.captvideo = captvideo;
        this.connectique = connectique;
        this.capteurdempreinte = capteurdempreinte;
        this.typewifi = typewifi;
        this.typebluetooth = typebluetooth;
        this.nfc = nfc;
        this.typedetancheite = typedetancheite;
        this.gyroscope = gyroscope;
        this.induction = induction;
        this.antichoc = antichoc;

    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isQuatreG() {
        return quatreG;
    }

    public void setQuatreG(boolean quatreG) {
        this.quatreG = quatreG;
    }

    public boolean isCinqG() {
        return cinqG;
    }

    public void setCinqG(boolean cinqG) {
        this.cinqG = cinqG;
    }

    public boolean isMicroSD() {
        return microSD;
    }

    public void setMicroSD(boolean microSD) {
        this.microSD = microSD;
    }

    public boolean isBatterieAmovible() {
        return batterieAmovible;
    }

    public void setBatterieAmovible(boolean batterieAmovible) {
        this.batterieAmovible = batterieAmovible;
    }

    public boolean isEsim() {
        return esim;
    }

    public void setEsim(boolean esim) {
        this.esim = esim;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getDiagonaleecran() {
        return diagonaleecran;
    }

    public void setDiagonaleecran(String diagonaleecran) {
        this.diagonaleecran = diagonaleecran;
    }

    public String getDefinitionecran() {
        return definitionecran;
    }

    public void setDefinitionecran(String definitionecran) {
        this.definitionecran = definitionecran;
    }

    public String getPartecran() {
        return partecran;
    }

    public void setPartecran(String partecran) {
        this.partecran = partecran;
    }

    public String getMemoirevive() {
        return memoirevive;
    }

    public void setMemoirevive(String memoirevive) {
        this.memoirevive = memoirevive;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getTypedecran() {
        return typedecran;
    }

    public void setTypedecran(String typedecran) {
        this.typedecran = typedecran;
    }

    public String getPucemobile() {
        return pucemobile;
    }

    public void setPucemobile(String pucemobile) {
        this.pucemobile = pucemobile;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public int getNbrdecoeur() {
        return nbrdecoeur;
    }

    public void setNbrdecoeur(int nbrdecoeur) {
        this.nbrdecoeur = nbrdecoeur;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCapabatterie() {
        return capabatterie;
    }

    public void setCapabatterie(String capabatterie) {
        this.capabatterie = capabatterie;
    }

    public String getCaptphotoav() {
        return captphotoav;
    }

    public void setCaptphotoav(String captphotoav) {
        this.captphotoav = captphotoav;
    }

    public String getCaptvideo() {
        return captvideo;
    }

    public void setCaptvideo(String captvideo) {
        this.captvideo = captvideo;
    }

    public String getConnectique() {
        return connectique;
    }

    public void setConnectique(String connectique) {
        this.connectique = connectique;
    }

    public boolean isCapteurdempreinte() {
        return capteurdempreinte;
    }

    public void setCapteurdempreinte(boolean capteurdempreinte) {
        this.capteurdempreinte = capteurdempreinte;
    }

    public String getTypewifi() {
        return typewifi;
    }

    public void setTypewifi(String typewifi) {
        this.typewifi = typewifi;
    }

    public String getTypebluetooth() {
        return typebluetooth;
    }

    public void setTypebluetooth(String typebluetooth) {
        this.typebluetooth = typebluetooth;
    }

    public boolean isNfc() {
        return nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public String getTypedetancheite() {
        return typedetancheite;
    }

    public void setTypedetancheite(String typedetancheite) {
        this.typedetancheite = typedetancheite;
    }

    public boolean isGyroscope() {
        return gyroscope;
    }

    public void setGyroscope(boolean gyroscope) {
        this.gyroscope = gyroscope;
    }

    public boolean isInduction() {
        return induction;
    }

    public void setInduction(boolean induction) {
        this.induction = induction;
    }

    public boolean isAntichoc() {
        return antichoc;
    }

    public void setAntichoc(boolean antichoc) {
        this.antichoc = antichoc;
    }
    

}
