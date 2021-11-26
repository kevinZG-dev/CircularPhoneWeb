/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import entity.Critere;
import entity.Fonctionnalite;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class FonctionnaliteDAOimpl implements FonctionnaliteDAO{
    
    /**
     * Selectionne dans la base de donnée les items en fonction du type
     *
     * @param type
     * @return list of item
     */
    @Override
    public Fonctionnalite selectFonctionbyId(int id, Connection conn) {
        Fonctionnalite newFonction = null;

        try (PreparedStatement pst_item = conn.prepareStatement("SELECT * FROM circularphone_db.fonctionnalite WHERE smartphone_idsmartphone =?")) {
            
            pst_item.setInt(1, id);
            ResultSet rs_items = pst_item.executeQuery();
            ImageIcon myImage;
            while (rs_items.next()) {
                String marque = rs_items.getString("marque");
                String os = rs_items.getString("os");
                boolean quatreG = rs_items.getBoolean("4g");
                boolean cinqG = rs_items.getBoolean("5g");
                boolean microSD = rs_items.getBoolean("microSD");
                boolean batterieamovible = rs_items.getBoolean("batterieamovible");
                boolean esim = rs_items.getBoolean("esim");
                String dimensions = rs_items.getString("dimensions");
                String poids = rs_items.getString("poids");
                String diagonaleecran = rs_items.getString("diagonaleecran");
                String definitionecran = rs_items.getString("definitionecran");
                String resolution = rs_items.getString("resolution");
                String typedecran = rs_items.getString("typedecran");
                String partecran = rs_items.getString("partecran");
                String pucemobile = rs_items.getString("pucemobile");
                String processeur = rs_items.getString("processeur");
                int nbrdecoeur = rs_items.getInt("nbrdecoeur");
                String gpu = rs_items.getString("gpu");
                String memoirevive = rs_items.getString("memoirevive");
                String capabatterie = rs_items.getString("capabatterie");
                String captphotoav = rs_items.getString("captphotoav");
                String captvideo = rs_items.getString("captvideo");
                String connectique = rs_items.getString("connectique");
                boolean capteurdempreinte = rs_items.getBoolean("capteurdempreinte");
                String typewifi = rs_items.getString("typewifi");
                String typebluetooth = rs_items.getString("typebluetooth");
                boolean nfc = rs_items.getBoolean("nfc");
                String typedetancheite = rs_items.getString("typedetancheite");
                boolean gyroscope = rs_items.getBoolean("gyroscope");
                boolean induction = rs_items.getBoolean("induction");
                boolean antichoc = rs_items.getBoolean("antichoc");
                
                newFonction = new Fonctionnalite(marque, os, quatreG, cinqG, microSD, batterieamovible, esim, dimensions, poids, diagonaleecran, definitionecran, resolution, typedecran, partecran, 
                        pucemobile, processeur, nbrdecoeur, gpu, memoirevive, capabatterie, captphotoav,captvideo,connectique,capteurdempreinte,typewifi,typebluetooth,nfc,typedetancheite,gyroscope,induction,antichoc);
                
            }
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in selectfonctio");
        }
        return newFonction;
    }
}
