/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Critere;
import entity.Fonctionnalite;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public interface FonctionnaliteDAO {
    

    
    public Fonctionnalite selectFonctionbyId(int id,Connection conn);
}
