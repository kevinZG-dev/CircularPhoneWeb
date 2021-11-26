/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Smartphone;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import static java.lang.Double.parseDouble;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class SmartphoneDAOimpl implements SmartphoneDAO {

    /**
     * Methode qui renvoie toute la liste des items a partir de la base de
     * donnée
     *
     * @return AllItems
     */
    public ArrayList<Smartphone> selectAllSmartphone() {

        CritereDAOimpl critDAO = new CritereDAOimpl();
        FonctionnaliteDAOimpl fonctiDAO = new FonctionnaliteDAOimpl();
        ArrayList<Smartphone> listSmartphone = new ArrayList<Smartphone>();
        ConnectionMySQL db = new ConnectionMySQL();
        Connection conn = db.getConnection();
        if (conn == null) {
            System.out.println("connection failed");

        } else {
            System.out.println("connection succeeded");
        }
        //Créer un statement à l'aide d'un objet connexion
        try (PreparedStatement pst_items = conn.prepareStatement("SELECT * FROM circularphone_db.smartphone")) {

            // execute la requete
            ResultSet rs_items = pst_items.executeQuery();
            ImageIcon myImage = null;

            // Step 4: Process the ResultSet object.
            while (rs_items.next()) {

                int id = rs_items.getInt("idsmartphone");
                String nom = rs_items.getString("nom");
                String couleur = rs_items.getString("couleur");
                String memoire = rs_items.getString("memoire");

                double prix = rs_items.getDouble("prix");
                double prixvolpy = rs_items.getDouble("prixvolpy");
                double prixback = rs_items.getDouble("prixback");
                double prixwefix = rs_items.getDouble("prixwefix");
                double prixfnac = rs_items.getDouble("prixfnac");
                double prixamazon = rs_items.getDouble("prixamazon");
                
                String lienvolpy = rs_items.getString("lienvolpy");
                String lienback = rs_items.getString("lienback");
                String lienwefix = rs_items.getString("lienwefix");
                String lienfnac = rs_items.getString("lienfnac");
                String lienamazon = rs_items.getString("lienamazon");

                double circularscore = rs_items.getDouble("circularscore");
                double indicederepa = rs_items.getDouble("indicerepa");
                String imgName1 = rs_items.getString("imgname1");
                String imgName2 = rs_items.getString("imgname2");
                String imgName3 = rs_items.getString("imgname3");
                String imgName4 = rs_items.getString("imgname4");


                listSmartphone.add(new Smartphone(id, nom, couleur, memoire, prix, prixvolpy, prixback, prixwefix, prixfnac, prixamazon, lienvolpy,lienback, lienwefix,lienfnac,lienamazon,
                       circularscore, indicederepa,fonctiDAO.selectFonctionbyId(id,conn), critDAO.selectCritereByType(id, "performance",conn), critDAO.selectCritereByType(id, "réparabilité",conn), critDAO.selectCritereByType(id, "devdurable",conn), imgName1,imgName2,imgName3,imgName4));
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in selectallitems");
        }
        return listSmartphone;
    }
    
    public Smartphone selectSmartphoneByName(String name) {
        
        CritereDAOimpl critDAO = new CritereDAOimpl();
        FonctionnaliteDAOimpl fonctiDAO = new FonctionnaliteDAOimpl();
        Smartphone smart = null;
        ConnectionMySQL db = new ConnectionMySQL();
        Connection conn = db.getConnection();
        if (conn == null) {
            System.out.println("connection failed");

        } else {
            System.out.println("connection succeeded");
        }
        //Créer un statement à l'aide d'un objet connexion
        try (PreparedStatement pst_items = conn.prepareStatement("SELECT * FROM circularphone_db.smartphone WHERE nom = ?")) {

            pst_items.setString(1, name);
            // execute la requete
            ResultSet rs_items = pst_items.executeQuery();
            // Step 4: Process the ResultSet object.

            while (rs_items.next()) {

                int id = rs_items.getInt("idsmartphone");
                String nom = rs_items.getString("nom");
                String couleur = rs_items.getString("couleur");
                String memoire = rs_items.getString("memoire");

                double prix = rs_items.getDouble("prix");
                double prixvolpy = rs_items.getDouble("prixvolpy");
                double prixback = rs_items.getDouble("prixback");
                double prixwefix = rs_items.getDouble("prixwefix");
                double prixfnac = rs_items.getDouble("prixfnac");
                double prixamazon = rs_items.getDouble("prixamazon");
                
                String lienvolpy = rs_items.getString("lienvolpy");
                String lienback = rs_items.getString("lienback");
                String lienwefix = rs_items.getString("lienwefix");
                String lienfnac = rs_items.getString("lienfnac");
                String lienamazon = rs_items.getString("lienamazon");

                double circularscore = rs_items.getDouble("circularscore");
                double indicederepa = rs_items.getDouble("indicerepa");
                String imgName1 = rs_items.getString("imgname1");
                String imgName2 = rs_items.getString("imgname2");
                String imgName3 = rs_items.getString("imgname3");
                String imgName4 = rs_items.getString("imgname4");
                
                

                smart = new Smartphone(id, nom, couleur, memoire, prix, prixvolpy, prixback, prixwefix, prixfnac, prixamazon, lienvolpy,lienback, lienwefix,lienfnac,lienamazon,
                       circularscore, indicederepa,fonctiDAO.selectFonctionbyId(id,conn), critDAO.selectCritereByType(id, "performance",conn), critDAO.selectCritereByType(id, "réparabilité",conn), critDAO.selectCritereByType(id, "devdurable",conn), imgName1,imgName2,imgName3,imgName4);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in selectallitems");
        }
        return smart;
        
    }

    /**
     * Methode DAO qui recoit en parametre l'id de l'item et en String le chemin
     * de l'image ajouté pour mettre a jour ce dernier
     *
     * @param idItem
     * @param chemin
     */
    @Override
    public void updatePicture(int id, String chemin) {

        ConnectionMySQL db = new ConnectionMySQL();
        Connection conn = db.getConnection();
        if (conn == null) {
            System.out.println("connection failed");

        } else {
            System.out.println("connection succeeded");
        }
        try (PreparedStatement pst_updateprice = conn.prepareStatement("UPDATE circularphone_db.smartphone SET img = ? WHERE idsmartphone = ?")) {

            //On crée un input stream
            InputStream img_to_save = null;
            //On recupere le nouveau fichier avec le chemin recu
            try {
                img_to_save = new FileInputStream(new File(chemin));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SmartphoneDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            //On envoie le input stream pour mettre a jour l'image selon l'iditem
            pst_updateprice.setBlob(1, img_to_save);
            pst_updateprice.setInt(2, id);
            //On execute la commande
            pst_updateprice.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error to update  picture");
        }
    }
}
