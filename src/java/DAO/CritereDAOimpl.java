/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Critere;

import java.awt.Image;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class CritereDAOimpl implements CritereDAO {

    //String contenant la commande au serveur sql
    private static final String SELECT_ITEMS_BY_TYPE = "SELECT idcritere, nom, note, type FROM circularphone_db.critere WHERE type =?";

    /**
     * Selectionne dans la base de donnée les items en fonction du type
     *
     * @param type
     * @return list of item
     */
    @Override
    public ArrayList<Critere> selectCritereByType(int id, String type, Connection conn) {
        ArrayList<Critere> mycritere = new ArrayList<Critere>();

        try (PreparedStatement pst_item = conn.prepareStatement("SELECT nom, note, type FROM circularphone_db.critere WHERE smartphone_idsmartphone =? AND type =?")) {

            pst_item.setInt(1, id);
            pst_item.setString(2, type);
            ResultSet rs_items = pst_item.executeQuery();
            ImageIcon myImage;
            while (rs_items.next()) {
                String nom = rs_items.getString("nom");
                double note = rs_items.getDouble("note");

                mycritere.add(new Critere(id, nom, note, type));
            }
        

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in select");
        }
        return mycritere;
    }
}
