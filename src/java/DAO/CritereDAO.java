/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Critere;
import java.sql.Connection;
import java.util.ArrayList;

/**
 * Interface DAO qui permet de faire la connection avec la 
 * table item de la base de donnée
 * 
 */
public interface CritereDAO {
    
   
    public abstract ArrayList<Critere> selectCritereByType(int id, String type,Connection conn);
}
