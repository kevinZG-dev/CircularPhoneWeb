/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Smartphone;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public interface SmartphoneDAO {

    
    public abstract ArrayList<Smartphone> selectAllSmartphone ();
    public Smartphone selectSmartphoneByName(String name);
    public abstract void updatePicture(int id, String chemin);
}
